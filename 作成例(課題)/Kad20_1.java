import java.util.Scanner;

public class Kad20_1{

	//階乗を求める再帰呼び出し関数
	public static int func(int i) {
		if(i > 1) {
			return(i * func(i - 1));
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args){
		
		System.out.print("階乗を求めます(0~10)＞");
		
		Scanner sc = new Scanner(System.in);
		try{
			int inNum = Integer.parseInt(sc.next());
			
			if(0 <= inNum && inNum <= 10) {	//1から10の数値が受付可能
				System.out.println(inNum + "の階乗は" + func(inNum) + "です。");
			} else {
				System.out.println("入力値が範囲外です。");
			}
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}
	}
}
