import java.util.Scanner;

public class Kad08_2{
	public static void main(String[] args){
		System.out.println("10進整数を2進数に変換します。");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10進整数＞");
		int decimal = sc.nextInt();
		
		int[] bit = new int[256];
		int i = 0;
		//2進数に変換し配列へ格納
		while(decimal > 0){
			bit[i] = decimal % 2;
			decimal /= 2;
			i++;
		}
		
		System.out.print("2進数：");
		//配列の末尾から先頭まで順に表示
		while(i > 0){
			i--;
			System.out.print(bit[i]);
		}
	}
}
