import java.util.Scanner;
import java.util.Random;

public class Kad23_2{
	//フィッシャー-イェーツのシャッフル
	public static void shuffle(int[] data){
		int i, j, tmp;	//カウンタ・退避変数
		Random ra = new Random();
		for(i = data.length - 1; i > 0; i--){
			j = ra.nextInt(i + 1);
			tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}
	
	/**
	 * ダブルナンバーサーチ
	 * 1~MAXNUMBERの数値をシャッフルして表示します。ただし、1つだけ数値がダブっています。
	 * そのダブっている数値を当てるゲームです。
	 */
	public static void main(String[] args){
	
		final int MAXNUMBER = 9;	//最大数
		int doubleNumber = 0;		//ダブルナンバー格納変数
		int[] numbers = new int[MAXNUMBER + 1];	//数値格納配列【23_2で+1に変更】
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ダブルナンバーサーチ！\n");
		while(true){
			//配列に数値格納【23_2でlength - 1に変更】
			int i;
			for(i = 0; i < numbers.length - 1; i++){
				numbers[i] = i + 1;
			}
			
			//ダブルナンバー決定
			Random ra = new Random();
			doubleNumber = ra.nextInt(MAXNUMBER) + 1;
			//末尾にダブルナンバー格納
			numbers[i] = doubleNumber; 
			
			//numbers配列シャッフル
			shuffle(numbers);
			
			//数値表示【23_2でカウンタを0からに変更】
			for(i = 0; i < numbers.length; i++){
				System.out.print(numbers[i] + " ");
			}
			System.out.print("\n重複している数値は？(1~" + MAXNUMBER + ")＞");
			try{
				//入力値がダブルナンバーと等しい場合
				if(Integer.parseInt(sc.next()) == doubleNumber){
					System.out.println("正解！");
					break;	//ループを抜けて終了
				}else{
					System.out.println("不正解！");
				}
			}catch(NumberFormatException nfe){
				System.out.println("入力値が不正です。");
			}
			System.out.println("");	//改行
		}
	}
}