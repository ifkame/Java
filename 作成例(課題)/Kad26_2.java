import java.util.Scanner;
import java.util.Random;

public class Kad26_2{
	//フィッシャー-イェーツのシャッフル
	public static void shuffle(int[] data){
		int i, j, tmp;	//カウンタ・退避変数
		for(i = data.length - 1; i > 0; i--){
			j = new Random().nextInt(i + 1);
			tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}
	
	/**
	 * マスターマインド
	 * 0~9の重複していない数値を当てるゲームです。
	 * 数値を解答し、その数値の位置と数が合っている場合はEAT、
	 * 位置は違うが数が合っている場合はBITEを返し、その情報を頼りに
	 * 数値を絞っていき、桁数分のEATが出たらクリアとなります。
	 */
	public static void main(String[] args){
		
		final int DIGIT = 4;			//桁数(1~10まで)
		int[] answer = new int[DIGIT]; 	//解答配列
		int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//①【Kad26_2で追加】
		int count = 0;	//答えた回数のカウンタ
		int eat = 0;	//位置も数値も合っている数
		int bite = 0;	//位置は違うが、数値は合っている数
		String inStr;	//入力文字格納変数
		int[] inNum = new int[DIGIT];	//入力値を1桁ずつ分解し格納する配列
		
		shuffle(number);	//元となる数値配列をシャッフルする
		
		//シャッフルした配列の先頭から桁数個取り出し、解答配列に格納する
		for(int i = 0; i < DIGIT; i++){
			answer[i] = number[i];
		}
		
		//【Kad26_2でここから追加】-----------------
		
		System.out.println("マスターマインド！" + DIGIT + "桁の数値を当てよう");
		while(eat != DIGIT){	//②
			try{
				System.out.print("\n数値を当ててください＞");
				inStr = new Scanner(System.in).next();	//③0を扱う為、文字として受け取る
				
				//④桁数チェック(一時的に文字に変換し、桁数を取得する)
				if(inStr.length() != DIGIT){
					System.out.println("桁数が違います。");
					continue;
				}
				
				//⑤入力文字を先頭から1字ずつ分解し、数値に変換させて配列に格納する
				for(int i = 0 ; i < DIGIT; i++){
					inNum[i] = Integer.parseInt(inStr.substring(i, i + 1));
				}
				
				//⑥EAT・BITE判定
				eat = 0; bite = 0;					//リセット
				for(int i = 0; i < DIGIT; i++){			//解答配列をなぞる
					for(int j = 0; j < DIGIT; j++){		//入力配列をなぞる
						if(answer[i] == inNum[j]){	//数値が一致した場合
							if(i == j){				//位置も一致している場合
								eat++;
							}else{					//位置が一致していない場合
								bite++;
							}
							break;
						}
					}
				}
				//⑦答えた回数のカウンタをインクリメントし、結果を表示する
				System.out.println(++count + "回目：" + eat + "EAT " + bite + "BITE");
			}catch(NumberFormatException nfe){	//⑤
				System.out.println("入力値が不正です。");	
			}
		}
		System.out.println("\nCLEAR!!");
	}
}