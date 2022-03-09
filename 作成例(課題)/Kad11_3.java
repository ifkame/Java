import java.util.Scanner;
import java.util.Random;	//Randomクラスインポート文

public class Kad11_3{
	//実行時パラメータに（コマンドライン引数）に[大吉 吉 中吉 小吉 末吉 凶]を設定する
	public static void main(String[] args){
		
		System.out.println("おみくじを引いた各結果の回数を求めます。");
		System.out.print("引く回数＞");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		//各結果の回数を格納する配列
		int[] results = new int[args.length];
		
		Random ra = new Random();	//Randomクラスオブジェクト作成
		
		for(int i = 1; i <= count; i++){
			int ransu = ra.nextInt(args.length);	//0~5の乱数生成
			System.out.println(i + "回目：" + args[ransu]);
			results[ransu]++;	//引いた結果の回数を1増やす
		}
		
		System.out.println("\n*** 結果表示 ***");
		//結果表示
		for(int i = 0; i < results.length; i++){
			System.out.println(args[i] + "：" + results[i] + "回");
		}
	}
}
