import java.util.Scanner;
import java.util.Random;

public class Kad25_2{
	/**
	 * ワードバスケット
	 * 
	 * ゲーム開始時、あ～わの44音からランダムに文字を選びそれを手札とする（文字の重複あり）
	 * しりとりのルール＋αとして末尾が手札の文字の言葉を入力したらその手札を消費する。
	 * 全ての手札を消費できたらクリア、というゲームです。
	 * 
	 * Kad25_1を元に処理を追加・変更します。
	 */
	public static void main(String[] args){
		
		final int MINLEN = 3;		//許容される最小文字数
		final char ENDCHAR = 'ん';	//終了文字
		char initial = 'り';		//言葉の頭文字（前回の末尾文字）
		String word;				//言葉格納変数
		
		//【25_2で追加】
		int hand = 4;					//手札枚数
		char[] handText = new char[hand];	//手札格納配列
		//手札候補ひらがな文字
		final String HIRAGANA = "あいうえおかきくけこさしすせそ" +
								"たちつてとなにぬねのはひふへほ" +
								"まみむめもやゆよらりるれろわ";
		
		//手札を決定する
		Random ra = new Random();
		for(int i = 0; i < handText.length; i++){
			handText[i] = HIRAGANA.charAt(ra.nextInt(HIRAGANA.length()));
		}
		
		System.out.println("ワードバスケット！手札の文字で終わる言葉を答えよう");
		
		Scanner sc = new Scanner(System.in);
		while(hand > 0){
			
			//手札表示
			System.out.print("\n手札：");
			for(char c : handText){
				System.out.print(c + "　");
			}
			
			System.out.print("\n「" + initial + "」から始まる言葉(" + MINLEN + "文字以上)＞");
			word = sc.next();
			
			//入力した文字列が許容される最小文字数未満の場合
			if(word.length() < MINLEN){
				System.out.println("文字数が足りません。");
				continue;
			}
			
			//入力した文字列の先頭文字と頭文字が等しくない場合
			if(word.charAt(0) != initial){
				System.out.println("頭文字が間違っています。");
				continue;
			}
			
			//入力した文字列の末尾が「ん」の場合
			if(word.charAt(word.length() - 1) == ENDCHAR){
				System.out.println("末尾に「" + ENDCHAR + "」が付いています。");
				continue;
			}
			
			//入力した文字列の末尾が伸ばし棒（ー）の場合
			if(word.charAt(word.length() - 1) == 'ー'){
				initial = word.charAt(word.length() - 2);	//末尾の前の文字を次の頭文字に
			}else{
				initial = word.charAt(word.length() - 1);	//末尾の文字を次の頭文字に
			}
			
			//末尾文字が手札の中にあるかどうか探索する
			for(int i = 0; i < handText.length; i++){
				//文字発見
				if(handText[i] == initial){
					handText[i] = '　';		//消費した手札を空文字に変更
					hand--;			//手札を１枚減らす
					break;				//探索終了
				}
			}
		}
		System.out.println("\nCLEAR!!");
	}
}