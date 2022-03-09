import java.util.Scanner;	//Scannerクラスを使用するためのインポート文

public class Kad04_2{
	public static void main(String[] args){
		
		System.out.println("2つの整数を入力して下さい。");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("整数a＞");
		int a = sc.nextInt();
		
		System.out.print("整数b＞");
		int b = sc.nextInt();
		
		if(a < b){
			int add = a + b;
			System.out.println(a + " ＋ " + b + " = " + add);
			int mul = a * b;
			System.out.println(a + " × " + b + " = " + mul);
	    }else{
			int sub = a - b;
			System.out.println(a + " － " + b + " = " + sub);
			int div = a / b;
			int rem = a % b;
			System.out.println(a + " ÷ " + b + " = " + div + " あまり " + rem);
		}
	}
}
