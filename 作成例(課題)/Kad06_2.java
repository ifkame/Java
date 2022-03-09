import java.util.Scanner;

public class Kad06_2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int flag;	//継続フラグ
		
		do{
			System.out.print("整数＞");
			int num = sc.nextInt();
			
			if(num % 2 == 0){
				System.out.println("偶数です。");
			}else{
				System.out.println("奇数です。");
			}
			
			System.out.print("[0->終了 1->継続]＞");
			flag = sc.nextInt();
		}while(flag == 1);
		System.out.println("終了します。");
	}
}
