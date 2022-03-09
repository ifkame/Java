import java.util.Scanner;	//Scannerクラスを使用するためのインポート文

public class Kad04_3 {
	public static void main(String[] args){
		
		System.out.println("3つの整数を入力して下さい。");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("整数a＞");
		int a = sc.nextInt();
		
		System.out.print("整数b＞");
		int b = sc.nextInt();
		
	    System.out.print("整数c＞");
		int c = sc.nextInt();
		
		if (a == b && b == c) {
			System.out.println("全て同じ値です。");
		}else if(a == b || b == c || c == a){
			System.out.println("2つの値が同じです。");
		}else{
	        System.out.println("3つの値は異なります。");
		}
	}

}
