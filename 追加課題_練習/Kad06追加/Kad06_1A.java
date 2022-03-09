import java.util.Scanner;

public class Kad06_1A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("リンゴの数を入力してください＞");
		int apple = sc.nextInt();
		System.out.print("食べる人の数を入力してください＞");
		int eater = sc.nextInt();
		
		if (apple >= eater) {
			System.out.println("一人ひとつずつリンゴを食べた！");
			apple -= eater;
		}
		System.out.println("余ったリンゴは" + apple + "個です！");
	}
}
