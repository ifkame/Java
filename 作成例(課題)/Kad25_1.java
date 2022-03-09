import java.util.Scanner;

public class Kad25_1{
	/**
	 * しりとり
	 * 最初は「り」から始まり、末尾に「ん」が付くと終了する。
	 * 以下の言葉が入力された場合再入力させる。
	 * 1.入力する言葉が３文字未満
	 * 2.頭文字が前回の末尾文字と違う
	 * 末尾の文字が伸ばし棒（ー）だった場合、その１つ前の文字を次の頭文字とする。
	 */
	public static void main(String[] args){
		
		final int MINLEN = 3;		//許容する最小文字数
		final char ENDCHAR = 'ん';	//終了文字
		char initial = 'り';		//言葉の頭文字（前回の末尾文字）
		String word;				//言葉格納変数
		
		System.out.println("しりとり！末尾に「" + ENDCHAR + "」が付いたら終了");
		
		Scanner sc = new Scanner(System.in);
		while(initial != ENDCHAR){
			System.out.print("\n「" + initial + "」から始まる言葉(" + MINLEN + "文字以上)＞");
			word = sc.next();
			
			//入力した文字列が許容される最小文字数未満の場合
			if(word.length() < MINLEN){
				System.out.println("文字数が足りません。");
				continue;
			}
			
			//入力した文字列の頭文字が前回の末尾文字と等しくない場合
			if(word.charAt(0) != initial){
				System.out.println("頭文字が間違っています。");
				continue;
			}
			//入力した文字列の末尾が伸ばし棒（ー）の場合
			if(word.charAt(word.length() - 1) == 'ー'){
				initial = word.charAt(word.length() - 2);	//末尾の前の文字を次の頭文字に
			}else{
				initial = word.charAt(word.length() - 1);	//末尾の文字を次の頭文字に
			}
		}
		System.out.println("\n終了します。");
	}
}