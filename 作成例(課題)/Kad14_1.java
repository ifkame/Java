import java.util.Scanner;

public class Kad14_1{
	
	public static void show(String data, int count){
		for(int i = 0; i < count; i++) {
			System.out.println(data);
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("表示文字＞");
		String inStr = sc.next();
		System.out.print("表示回数＞");
		try{
			int inNum = Integer.parseInt(sc.next());
			show(inStr, inNum);
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}
	}
}
