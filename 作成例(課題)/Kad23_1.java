import java.util.Scanner;
import java.util.Random;

public class Kad23_1{
	//フィッシャー-イェーツのシャッフル
	public static void shuffle(int[] data){
		Random ra = new Random();
		for(int i = data.length - 1; i > 0; i--){
			int j = ra.nextInt(i + 1);
			int tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}
	
	/**
	 * ラックナンバーサーチ
	 * 1~MAXNUMBERの数値をシャッフルして表示します。ただし、1つだけ数値が欠けています。
	 * その欠けている数値を当てるゲームです。
	 */
	public static void main(String[] args){
	
		final int MAXNUMBER = 9;	//最大数
		int lackNumber = 0;			//ラックナンバー格納変数
		int[] numbers = new int[MAXNUMBER];	//数値格納配列
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ラックナンバーサーチ！\n");
		while(true){
			//配列に数値格納
			for(int i = 0; i < numbers.length; i++){
				numbers[i] = i + 1;
			}
			
			//numbers配列シャッフル
			shuffle(numbers);
			
			//先頭要素をラックナンバーとする
			lackNumber = numbers[0];
			
			//数値表示
			for(int i = 1; i < numbers.length; i++){
				System.out.print(numbers[i] + " ");
			}
			
			System.out.print("\n欠けている数値は？(1~" + MAXNUMBER + ")＞");
			try{
				//入力値がラックナンバーと等しい場合
				if(Integer.parseInt(sc.next()) == lackNumber){
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