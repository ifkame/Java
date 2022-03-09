import java.util.Scanner;

public class Kad05_1A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3で割り切った余りを計算します！");
		System.out.print("整数を入力してください＞");
		int num = sc.nextInt();
		
		switch(num % 3){
			case 0:
			System.out.println("割り切れました！");
			break;
			case 1:
			System.out.println("余りは1です！");
			break;
			case 2:
			System.out.println("余りは2です！");
			break;
		}
	}
}