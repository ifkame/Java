import java.util.Scanner;
import java.util.Random;

public class Kad24_2{
	
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
	 * 【24_2で分岐追加】
	 * ビンゴカード表示メソッド
	 */
	public static void showCard(int[][] card){
		System.out.println("-------------");
		for(int i = 0; i < card.length; i++){
			System.out.print("| ");
			for(int j = 0; j < card[i].length; j++){
				if(card[i][j] == 0){				//【24_2追加】
					System.out.print("X" + " | ");	// 0の時はXと表示
				}else{
					System.out.print(card[i][j] + " | ");
				}
			}
			System.out.println("\n-------------");
		}
	}
	
	/**
	 * 【24_2で追加】
	 * 数字が当たったかどうか確認するメソッド
	 */
	public static void checkHit(int[][] card, int ball){
		for(int i = 0; i < card.length; i++){
			for(int j = 0; j < card[i].length; j++){
				if(card[i][j] == ball){
					card[i][j] = 0;
				}
			}
		}
	}
	
	/**
	 * 【24_2で追加】
	 * ビンゴしているかチェックするメソッド
	 * 1列でもビンゴしていればtrue、してなければfalseを返す。
	 */
	public static boolean checkBingo(int[][] card){
		final int LEN = card.length;	//一辺(横・縦・斜め)の長さ
		int i, j, count = 0;
		
		//横チェック
		for(i = 0; i < LEN; i++){
			for(j = 0; j < LEN; j++){
				if(card[i][j] == 0){
					count++;
				}
			}
			if(count == LEN){
				return true;	//ビンゴ
			}else{
				count = 0;		//カウンタリセット
			}
		}
		
		//縦チェック
		for(i = 0; i < LEN; i++){
			for(j = 0; j < LEN; j++){
				if(card[j][i] == 0){
					count++;
				}
			}
			if(count == LEN){
				return true;	//ビンゴ
			}else{
				count = 0;		//カウンタリセット
			}
		}
		
		//斜め（＼）チェック
		for(i = 0; i < LEN; i++){
			if(card[i][i] == 0){
				count++;
			}
		}
		if(count == LEN){
			return true;	//ビンゴ
		}else{
			count = 0;		//カウンタリセット
		}
		
		//斜め（／）チェック
		for(i = 0; i < LEN; i++){
			if(card[i][(LEN - 1) - i] == 0){
				count++;
			}
		}
		if(count == LEN){
			return true;	//ビンゴ
		}
		return false;
	}
	
	/**
	 * BINGOゲームを行う
	 */
	public static void main(String[] args){
		int[][] bingoCard = createCard();
		System.out.println("BINGOゲーム！\nあなたのカードはこちらです。");
		showCard(bingoCard);	//カード表示
		
		//【Kad24_2でここから下を追加】
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("\nｶﾞﾗｶﾞﾗｶﾞﾗ...何番の玉が出ましたか？＞");
			try{
				int bingoBall = Integer.parseInt(sc.next());
				checkHit(bingoCard, bingoBall);	//数が当たったかどうか調べる
				showCard(bingoCard);			//カード表示
				
				//ビンゴ判定
				if(checkBingo(bingoCard)){
					System.out.println("BINGO!!");
					break;
				}
			}catch(NumberFormatException nfe){
				System.out.println("入力値が不正です。");
			}
		}
	}
}