import java.util.Scanner;

public class Kad07_2{
	public static void main(String[] args){
		
		System.out.println("四角形を描画します。");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("行数＞");
		int row = sc.nextInt();
		System.out.print("列数＞");
		int col = sc.nextInt();
		
		//行のループ
		for(int i = 1; i <= row; i++){
			//列のループ
			for(int j = 1; j <= col; j++){
				System.out.print("□");
			}
			System.out.println("");	//改行
		}
	}
	
}
