import java.util.Scanner;

public class Kad05_3{
	public static void main(String[] args){
		
		System.out.println("*** 3種の除算 ***");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("整数1＞");
		int num1 = sc.nextInt();
		System.out.print("整数2＞");
		int num2 = sc.nextInt();
		
		//割る数が0の場合
		if(num2 == 0){
			System.out.println("0で割ることは出来ません。");
		}else{
			System.out.print("[1->除算 2->整数除算 3->剰余算]＞");
			int operation = sc.nextInt();
			
			switch(operation){
			case 1:	//除算
				System.out.println(num1 + " ÷ " + num2 + " ＝ " + (double)num1 / num2);
				break; 
			case 2:	//整数除算
				System.out.println(num1 + " ÷ " + num2 + " ＝ " + num1 / num2);
				break; 
			case 3:	//剰余算
				System.out.println(num1 + " ÷ " + num2 + " ＝ " + num1 / num2 + " あまり " + num1 % num2);
				break; 
			default:
				System.out.println("演算方法が範囲外です。");
				break; 
			}
		}
	}
}
