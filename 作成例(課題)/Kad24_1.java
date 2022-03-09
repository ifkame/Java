import java.util.Random;

public class Kad24_1{
	
	/**
	 * ビンゴカード作成メソッド
	 */
	public static int[][] createCard(){
		int card[][] = new int[3][3];	//数値格納配列
		int ransu = 0;					//乱数格納変数
		boolean[] ransuFlag = new boolean[9];	//乱数フラグ(true:使用済 false:未使用)
		Random ra = new Random();
		
		//1~9までの乱数を重複させずに二次元配列に格納する
		for(int i = 0; i < card.length; i++){
			for(int j = 0; j < card[i].length; j++){
				do{
					ransu = ra.nextInt(9);
				}while(ransuFlag[ransu]);
				ransuFlag[ransu] = true;
				card[i][j] = ransu + 1;
			}
		}
		return card;
	}
	
	/**
	 * ビンゴカード表示メソッド
	 */
	public static void showCard(int[][] card){
		System.out.println("-------------");
		for(int i = 0; i < card.length; i++){
			System.out.print("| ");
			for(int j = 0; j < card[i].length; j++){
				System.out.print(card[i][j] + " | ");
			}
			System.out.println("\n-------------");
		}
	}
	
	/**
	 * ビンゴゲームを行う為のビンゴカードを作成する
	 */
	public static void main(String[] args){
		int[][] bingoCard = createCard();	//ビンゴカードを作成し格納
		System.out.println("BINGOゲーム！\nあなたのカードはこちらです。");
		showCard(bingoCard);	//カード表示
	}
}