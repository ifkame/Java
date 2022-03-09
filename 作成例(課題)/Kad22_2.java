import java.util.Scanner;

public class Kad22_2{
	
	/**
	 * 石取りゲーム
	 * 20個の石を2人が交互に1~4個取り合い、最後の1個を取ってしまった方が負け。
	 * この課題のコンピュータは必勝パターンで数を取り、プレイヤーが必ず負ける。
	 */
	public static void main(String[] args){
		
		final String[] TURN = {"コンピュータ", "プレイヤー"};
		final int STONE = 20;	//初期の石の数
		final int TAKEMAX = 4;	//取れる最大数
		int remStone = STONE;	//残りの石の数
		int takeStone= 0;		//取った石の数
		int turnFlag = 0;		//ターンフラグ(0:コンピュータ 1:プレイヤー)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("最強コンピュータと石取り勝負！");
		while(remStone > 0){
			//残りの石を表示
			System.out.print("\n残り：");
			for(int i = 0; i < remStone; i++){
				System.out.print("●");
			}
			
			System.out.print("\n" + TURN[turnFlag] + "のターン！");
			try{
				//コンピュータのターン
				if(turnFlag == 0){
					//必勝パターンでの数を取得
					takeStone = (TAKEMAX + remStone) % (TAKEMAX + 1);	//【変更する部分はここだけ】
					//取った数を表示
					System.out.println(TURN[turnFlag] + "は" + takeStone +"個取った！");
				}else{
					//プレイヤーのターン
					System.out.print("何個取りますか？(1~" + TAKEMAX + ")＞");
					takeStone = Integer.parseInt(sc.next());
					//1-TAKEMAXの範囲以外は不正とし、再入力させる
					if(takeStone < 1 || takeStone > TAKEMAX){
						System.out.println("入力値が範囲外です。");
						continue;
					}
				}
				//残りの石の数から取った石の数分減らす
				remStone -= takeStone;
				
				//残りの石の数が1未満になった場合、ターンプレイヤー敗北
				if(remStone < 1){
					System.out.println("\n決着：" + TURN[turnFlag] + "の負け！");
				}
				//ターンフラグ切り替え(0 ←→ 1)
				turnFlag = 1 - turnFlag;
			}catch(NumberFormatException nfe){
				System.out.println("入力値が不正です。");
			}
		}
	}
}