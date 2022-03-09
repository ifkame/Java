import java.util.Scanner;

public class Kad27_1{
	/**
	 * フィボナッチ数列
	 */
	public static int fibonacci(int n){
		
		//引数で受け取った数値が0の時は0を1の時は1を返す
		if(n == 0){	
			return 0;
		}else if(n == 1){	
			return 1;
		}
		//1つ前の数値と2つ前の数値を引数にして、自身を再帰的に呼び出した結果の和を返す。
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		final int MAX = 20;	//フィボナッチ数列の最大数
		
		System.out.println("*** フィボナッチ数列 ***");
		System.out.print("いくつ生成しますか？(1~" + MAX + ")：");
		try{
			int inNum = Integer.parseInt(sc.next());
			if(inNum < 1 || inNum > MAX){
				System.out.println("入力値が範囲外です。");
			}else{
				for(int i = 0; i < inNum; i++){
					System.out.print(fibonacci(i) + ",");	//フィボナッチ数列表示
				}
			}
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}
	}
}
