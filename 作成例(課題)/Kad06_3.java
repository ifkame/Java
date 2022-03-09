import java.util.Scanner;

public class Kad06_3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;	//合計値
		int count = 0;	//入力回数
		
		while(true){
			System.out.print("整数" + (count + 1) + "＞");
			int num = sc.nextInt();	
			//0が入力された場合
			if(num == 0){
				break;		//ループ終了
			}
			total += num;	//合計値加算
			count++;		//入力回数加算
		}
		//入力回数が0じゃない場合
		if(count != 0){
			System.out.println("合計値は" + total + "で、平均値は" + (total / count) + "です。");
		}
	}
}
