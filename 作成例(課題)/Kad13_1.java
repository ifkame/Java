import java.util.Scanner;
import java.util.InputMismatchException;

public class Kad13_1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("®”1„");
			int num1 = sc.nextInt();
			System.out.print("®”2„");
			int num2 = sc.nextInt();
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}catch(InputMismatchException ime){
			System.out.println(ime);
			System.out.println("“ü—Í’l‚ÌŒ^‚ª•sˆê’v‚Å‚·B");
		}
	}
}
