import java.util.Scanner;

public class Kad09_1{
	public static void main(String[] args){
		
		//乗車賃表
		int[][] fare = {{  0, 150, 240, 360},
						{150,   0, 170, 270},
						{240, 170,   0, 190},
						{360, 270, 190,   0}};
						
		Scanner sc = new Scanner(System.in);
		System.out.print("乗車停留所(1~4)＞");
		int row = sc.nextInt();
		
		System.out.print("降車停留所(1~4)＞");
		int col = sc.nextInt();
		
		//乗車駅と降車駅が同じ場合
		if(row == col){
			System.out.println("同じ停留所です。");
			
		//1~4以外の数値を入力した場合
		}else if(row < 1 || row > 4 || col < 1 || col > 4){
			System.out.println("1~4の数値を入力してください。");
			
		}else{
			System.out.println(row + "から" + col + "までの乗車賃は" + fare[row - 1][col - 1] + "円です。");
		}
	}
}
