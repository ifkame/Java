import java.util.Scanner;
import java.util.Random;

public class Kad14_2{
	
	//数当てチェック
	public static int check(int n, int ans) {
		if(n > ans){
			//入力値が答えより大きい
			return 1;
		}else if(n < ans){
			//入力値が答えより小さい
			return 2;
		}else{
			//入力値が答えと一致
			return 3;
		}
	}
	
	public static void main(String[] args){
		
		final int MAX = 100;	//乱数最大値
		Random rnd = new Random();
		int ransu = rnd.nextInt(MAX) + 1;	//1~MAXまでの乱数生成
		System.out.println("*** 数当てゲーム ***");
		
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
				System.out.print("何番でしょう？(1~" + MAX + ")＞");
				int inNum = Integer.parseInt(sc.next());
				int result = check(inNum, ransu);
				if(result == 1){
					System.out.println("もっと小さいよ！");
				}else if(result == 2){
					System.out.println("もっと大きいよ！");
				}else if(result == 3){
					System.out.println("正解！");
					break;
				}
			}catch(NumberFormatException nfe){
				System.out.println("入力値が不正です。");
			}
		}
	}
}
