import java.util.Scanner;
import java.util.Random;

public class Kad21_1{
	
	/**
	 * コンピュータとじゃんけん
	 */
	public static void main(String[] args){
		
		final String[] HAND = {"グー", "チョキ", "パー"};
		final String[] RESULT = {"あいこだ！", "負けちゃった！", "勝ったぞ！"};
		
		System.out.println("コンピュータとじゃんけん勝負！");
		System.out.print("[0->グー 1->チョキ 2->パー]＞");
		try{
			//プレイヤーの手を入力＆表示
			Scanner sc = new Scanner(System.in);
			int pHand = Integer.parseInt(sc.next());
			System.out.println("プレイヤー：" + HAND[pHand]);
			//コンピュータの手を決定＆表示
			Random ra = new Random();
			int cHand = ra.nextInt(3);
			System.out.println("コンピュータ：" + HAND[cHand]);
			
			//プレイヤー視点の結果を表示
			System.out.println(RESULT[(pHand - cHand + 3) % 3]);
			
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println("入力値が範囲外です。");
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}
	}
}
