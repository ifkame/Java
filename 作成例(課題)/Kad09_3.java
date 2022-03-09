public class Kad09_3{
	public static void main(String[] args){
		
		final int LEN = 5;	//一辺の長さ
		char[][] triangle = {{'■','□','□','□','□'},
							 {'■','■','□','□','□'},
							 {'■','■','■','□','□'},
							 {'■','■','■','■','□'},
							 {'■','■','■','■','■'}};
		int i, j;	//ループカウンタ
		
		//上部
		for(i = 0; i < LEN; i++){
			//左上
			for(j = LEN - 1; j >= 0; j--){
				System.out.print(triangle[i][j]);
			}
			//右上
			for(j = 0; j < LEN; j++){
				System.out.print(triangle[i][j]);
			}
			System.out.println("");	//改行
		}
		
		//下部
		for(i = LEN - 1; i >= 0; i--){
			//左下
			for(j = LEN - 1; j >= 0; j--){
				System.out.print(triangle[i][j]);
			}
			//右下
			for(j = 0; j < LEN; j++){
				System.out.print(triangle[i][j]);
			}
			System.out.println("");	//改行
		}
	}
}