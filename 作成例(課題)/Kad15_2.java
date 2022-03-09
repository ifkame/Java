import java.util.Scanner;
import java.util.Arrays;

public class Kad15_2{
	
	// エラトステネスの篩に基づき、素数を求める
	public static boolean[] eratosthenes(int n){
	
		// 素数フラグ宣言(true:素数, false:非素数)
		boolean[] flag = new boolean[n + 1];
		
		// 素数フラグの初期化(2からnまでを素数候補としてtrueを代入する)
		Arrays.fill(flag, 2, n, true);
		
		// 素数の倍数を素数候補から除外(非素数をfalseにする)
		for(int i = 2; i <= Math.sqrt(n); i++){
			for(int j = i * 2; j <= n; j += i){
				flag[j] = false;
			}
		}
		return flag;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("いくつまでの素数を求めますか？＞");
		
		try{
			int inNum = Integer.parseInt(sc.next());
			
			// エラトステネスメソッドを呼びだし素数を求め、
			// 戻り値のboolean型配列(true:素数, false:非素数)を代入する。
			boolean[] primeNumFlag = eratosthenes(inNum);
			
			// 求めた素数を表示
			for(int i = 2; i <= inNum; i++){
				if(primeNumFlag[i]){
					System.out.print(i + " ");
				}
			}
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}
	}
}