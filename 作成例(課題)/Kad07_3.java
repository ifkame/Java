public class Kad07_3{
	public static void main(String[] args){
		
		//1~9の段横表示
		System.out.print("  |");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d ", i);
		}
		
		//罫線
		System.out.println("\n------------------------------");
		
		//行ループ
		for(int i = 1; i <= 9; i++){
			System.out.printf("%2d|", i);	//1~9の段縦表示
			//列ループ
			for(int j = 1; j <= 9; j++){
				System.out.printf("%2d ", i * j);
			}
			System.out.println("");	//改行
		}
	}
}
