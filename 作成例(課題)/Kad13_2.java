import java.util.Scanner;

public class Kad13_2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
				System.out.print("整数1＞");
				int num1 = Integer.parseInt(sc.next());
				System.out.print("整数2＞");
				int num2 = Integer.parseInt(sc.next());
				System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
				break;
			}catch(NumberFormatException nfe){
				System.out.println(nfe);
				System.out.println("入力値を整数に変換できません。");
			}catch(ArithmeticException ae){
				System.out.println(ae);
				System.out.println("0で割ることは出来ません。");
			}
		}
	}
}
