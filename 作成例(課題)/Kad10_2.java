public class Kad10_2{
	public static void main(String[] args){
		
		//キーボード
		char[][] keyboard ={{'あ', 'か', 'さ'},
							{'た', 'な', 'は'},
							{'ま', 'や', 'ら'},
							{'絵', 'わ', '！'}};
		
		//最上部罫線
		System.out.println("----------------");
		//行ループ
		for(char[] row : keyboard){
			System.out.print("| ");
			//列ループ
			for(char col : row){
				System.out.print(col + " | ");
			}
			System.out.println("\n----------------");	//改行 & 罫線
		}
	}
}