import java.util.Scanner;

public class Kad13_2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
				System.out.print("����1��");
				int num1 = Integer.parseInt(sc.next());
				System.out.print("����2��");
				int num2 = Integer.parseInt(sc.next());
				System.out.println(num1 + " �� " + num2 + " = " + (num1 / num2));
				break;
			}catch(NumberFormatException nfe){
				System.out.println(nfe);
				System.out.println("���͒l�𐮐��ɕϊ��ł��܂���B");
			}catch(ArithmeticException ae){
				System.out.println(ae);
				System.out.println("0�Ŋ��邱�Ƃ͏o���܂���B");
			}
		}
	}
}
