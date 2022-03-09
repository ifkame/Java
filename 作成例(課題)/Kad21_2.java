import java.util.Scanner;
import java.util.Random;

public class Kad21_2{
	
	/**
	 * 二台のコンピュータとじゃんけん
	 */
	public static void main(String[] args){
		
		final int ENDPOINT = 3;		//終了ポイント
		final String[] HAND = {"グー", "チョキ", "パー"};
		final String[] RESULT = {"あいこだ！", "負けちゃった！", "勝ったぞ！"};
		int point = 0;				//プレイヤーのポイント
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		
		System.out.println("二台のコンピュータとじゃんけん勝負！");
		
		//終了ポイントに満たない間ループ
		while(point < ENDPOINT){
			System.out.print("\n[0->グー 1->チョキ 2->パー]＞");
			try{
				//プレイヤーの手を入力＆表示
				int pHand = Integer.parseInt(sc.next());
				System.out.println("プレイヤー：" + HAND[pHand]);
				//コンピュータ1の手を決定＆表示
				int c1Hand = ra.nextInt(3);
				System.out.println("コンピュータ１：" + HAND[c1Hand]);
				//コンピュータ2の手を決定＆表示
				int c2Hand = ra.nextInt(3);
				System.out.println("コンピュータ２：" + HAND[c2Hand]);
				
				//勝者判定・出した手の合計を3で割った余りが、
				switch((pHand + c1Hand + c2Hand) % 3){
				//0の場合はあいこ
				case 0: 
					System.out.print(RESULT[0]);
					break;
				//1の場合は二人勝ち
				case 1:
					//コンピュータ1と2が同じ手の場合、
					if(c1Hand == c2Hand){
						System.out.print(RESULT[1]);	//プレイヤー敗北
					}else{
						System.out.print(RESULT[2]);	//プレイヤー勝利
						point++;
					}
					break;
				//2の場合は一人勝ち
				case 2:
					//コンピュータ1と2が同じ手の場合、
					if(c1Hand == c2Hand){
						System.out.print(RESULT[2]);	//プレイヤー勝利
						point++;
					}else{
						System.out.print(RESULT[1]);	//プレイヤー敗北
					}
				}
				System.out.println("(" + point + "勝)");
			}catch(ArrayIndexOutOfBoundsException aioobe){
				System.out.println("入力値が範囲外です。");
			}catch(NumberFormatException nfe){
				System.out.println("入力値が不正です。");
			}
		}
	}
}
