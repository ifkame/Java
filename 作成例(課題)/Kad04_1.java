import java.util.Scanner;	//Scannerクラスを使用するためのインポート文

public class Kad04_1{
	 public static void main(String[] args){
	 	
	 	Scanner sc = new Scanner(System.in);
		System.out.print("名前＞");
		String name = sc.next();
		System.out.println(name + "さんこんにちは。");
		
		System.out.print("\n年齢＞");
		int age = sc.nextInt();
		System.out.println(age + "歳とすると、10年後は" + (age + 10) + "歳ですね。");
	 }
}