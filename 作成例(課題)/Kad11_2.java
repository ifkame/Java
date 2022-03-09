import java.util.Scanner;
import java.util.Random;	//Randomクラスインポート文

public class Kad11_2{
	public static void main(String[] args){
		
		final int MAXROLL = 6;	//出目の最大値
		int total = 0;			//合計値
		
		System.out.println(MAXROLL + "面ダイスを振った出目の平均値を求めます。");
		System.out.print("振る回数＞");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		Random ra = new Random();	//Randomクラスオブジェクト作成
		
		for(int i = 1 ; i <= count; i++){
			int dice = ra.nextInt(MAXROLL) + 1;	//ダイスを振る
			System.out.println(i + "回目：" + dice);
			total += dice;	//合計値に加算
		}
		
		System.out.println("平均値：" + (double)total / count);
	}
}
