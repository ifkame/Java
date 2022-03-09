public class Kad18_2{
	
	//バブルソート
	//@param data 検索対象配列
	public static void bubbleSort(int[] data){
		
		// データを比較する回数ループ
		for(int i = 0; i < data.length - 1; i++){
			// 前から順番に比較する回数ループ
			for(int j = 1; j < data.length - i; j++){
				/*	1つ前の値と比較して、
					1つ前の値が大きいとき	*/
				if(data[j - 1] > data[j]){
					// 入れ替えの処理
					int tmp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = tmp;
				}
			}
			printArray(data);	//配列の値を表示
		}
	}
	
	//配列の値表示
	//@param data 表示対象配列
	public static void printArray(int[] data) {
		
		for(int d : data){
			System.out.print(d + ", ");
		}
		System.out.println("");	//改行
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {2, 5, 8, 1, 4, 7, 3, 6, 9, 0};
		
		System.out.println("********* 元データ *********");
		printArray(numbers);
		System.out.println("***** バブルソート開始 *****");
		bubbleSort(numbers);
		System.out.println("***** バブルソート完了 *****");
	}
}
