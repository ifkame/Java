public class Kad10_3{
	public static void main(String[] args){
		
		int[][] table = {{50, 70, 30},
						 {80, 60, 10},
						 {40, 20, 90}};
		
		//先頭要素を最小値と最大値の初期値にする
		int min = table[0][0];	//最小値
		int max = min;			//最大値
		int total = 0;			//合計値
		
		System.out.println("二次元配列から最小値・最大値・合計値を求めます。\n");
		
		//行ループ
		for(int[] row : table){
			//列ループ
			for(int col : row){
				System.out.print(col + ",");	//カンマ区切りで値表示
				
				//表示した値が現在の最小値より小さい場合
				if(col < min){
					min = col;	//最小値更新
				}
				
				//表示した値が現在の最大値より大きい場合
				if(col > max){
					max = col;	//最大値更新
				}
				
				total += col;	//合計値加算
			}
			System.out.println("");	//改行
		}
		System.out.println("\n最小値は" + min + "で、" + "最大値は" + max + "で、" + "合計値は" + total + "です。");
	}
}
