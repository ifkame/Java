import java.util.Scanner;

public class Kad12_3{
	
	enum Character{勇者, 盗賊, 魔法使い, 僧侶}
	
	public static void main(String[] args){
		
		final int[] POWER = {100, 80, 20, 40};	//キャラクター別の通常攻撃ダメージ
		final int[] MAGIC = {70, 50, 120, 80};	//キャラクター別の魔法攻撃ダメージ
		int i = 0;	//キャラクターカウンタ（0->勇者 1->盗賊 2->魔法使い 3->僧侶）
		int hitPoint = 300;	//魔王の体力
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********** ECC QUEST **********");
		System.out.println("魔王が現れた！▼");
		System.out.println("「単位が欲しくば１ターンで私を倒してみろ！」\n");
		
		for(Character c : Character.values()) {
			//行動入力
			System.out.print(c + "はどうする？[1->通常攻撃 2->魔法攻撃 他->逃げる]＞");
			int action = sc.nextInt();
			
			//行動処理
			switch(action){
			case 1:
				System.out.println(c + "の通常攻撃！ " + POWER[i] + "ダメージ！▼");
				hitPoint -= POWER[i];
				break;
			case 2:
				System.out.println(c + "の魔法攻撃！" + MAGIC[i] + "ダメージ！▼");
				hitPoint -= MAGIC[i];
				break;
			default:
				System.out.println(c + "は逃げだした！ しかし回り込まれた！▼");
				break;
			}
			
			//勝利判定
			if(hitPoint <= 0){
				System.out.println("\n魔王を倒した！▼\n単位を手に入れた！");
				System.out.println("********** GAME CLEAR **********");
				break;
			}else{
				i++;	//次のキャラクターへ
			}
			
			//敗北判定
			if(i == Character.values().length){
				System.out.println("\n魔王を倒せなかった！▼\n単位が取れず留年した！");
				System.out.println("********** BAD END **********");
			}
		}
	}
}
