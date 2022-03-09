public class Kad18_1{
	
	//選択ソート
	//@param data 検索対象配列
	public static void selectSort(int[] data) {
		
		// データを比較する回数分ループ(length-1回)
		for(int i = 0; i < data.length - 1; i++){
			int pos = i;	//初期値としてi番目を最小値の要素とする
			// 最初の値と比較する回数分ループ(length-2回)
			for(int j = i + 1; j < data.length; j++){
				/*	最小値(仮)と値を比較して、
					最小値の方が大きいとき	*/
				if(data[j] < data[pos]){
					// 最小値のある要素番号を格納
					pos = j;
				}
			}
			//i番目と最小値を交換
			int tmp = data[i];
			data[i] = data[pos];
			data[pos] = tmp;
			
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
		System.out.println("****** 選択ソート開始 ******");
		selectSort(numbers);
		System.out.println("****** 選択ソート完了 ******");
	}
}
