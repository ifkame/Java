public class Kad09_2{
	public static void main(String[] args){
		
		int[][] table = {{1, 2, 3, 4},
						 {5, 6, 7, 8},
						 {9, 10, 11, 12}};
						 
		int[] rowSum = new int[3];	//行合計
		int[] colSum = new int[4];	//列合計
		int total = 0;				//総合計
		
		System.out.println("*** 3行4列のクロス集計表 ***");
		
		//行ループ
		for(int i = 0; i < rowSum.length; i++){
			//列ループ
			for(int j = 0; j < colSum.length; j++){
				rowSum[i] += table[i][j];	//行合計加算
				colSum[j] += table[i][j];	//列合計加算
				total += table[i][j];		//総合計加算
				System.out.print(table[i][j] + "\t");	//タブ区切りで値表示
			}
			System.out.println(" | " + rowSum[i]);	//行合計表示
		}
		System.out.println("-------------------------------------");
		
		//列合計表示
		for(int i = 0; i < colSum.length; i++) {
			System.out.print(colSum[i] + "\t");
		}
		//総合計表示
		System.out.println(" | " + total);
	}
		
}
