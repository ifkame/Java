import java.util.Scanner;

public class Kad15_1{
	
	//ユークリッドの互除法
	public static int euclid(int x, int y){
		int rem;	//余り
		
		//yが0でない間ループ
		while(y != 0){
			rem = x % y;	//xをyで割った余りをremに代入
			x = y;			//xをyで更新
			y = rem;		//yを余りで更新
		}
		return x;	//x（最大公約数）を返す
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("整数1＞");
			int num1 = Integer.parseInt(sc.next());
			System.out.print("整数2＞");
			int num2 = Integer.parseInt(sc.next());
			System.out.println("最大公約数：" + euclid(num1, num2));
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}
	}
}