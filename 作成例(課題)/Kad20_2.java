public class Kad20_2{
	
	// クイックソート(昇順)
	public static void quickSort(int[] data, int left, int right) {
		
		//ソート終了
		if(left >= right){
			return;
		}
		
		//基準値
		int pivot = data[(left + right) / 2];
		//探索用要素
		int searchLeft = left, searchRight = right;
		
		//探索用要素が重なるまでループする
		while(searchLeft < searchRight){
			//基準値以上の値が見つかるまで左から順に探索する
			while(data[searchLeft] < pivot){ 
				searchLeft++;
			}
			//基準値以下の値が見つかるまで右から順に探索する
			while(data[searchRight] > pivot){
				searchRight--;
			}
			//探索要素が交差した場合は交換せずにループを抜ける
			if(searchLeft > searchRight){
				break;
			}
			
			//探索した基準値より大きい値と小さい値を入れ替える
			int tmp = data[searchLeft];
			data[searchLeft] = data[searchRight];
			data[searchRight] = tmp;
			//探索開始位置を更新する
			searchLeft++;
			searchRight--;
		}
		printArray(data);	//配列の値を表示
		//基準値より左側を再帰呼び出しでクイックソートする
		quickSort(data, left, searchRight);
		//基準値より右側を再帰呼び出しでクイックソートする
		quickSort(data, searchLeft, right);
	}
	
	//配列の値表示
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
		System.out.println("**** クイックソート開始 ****");
		quickSort(numbers, 0, numbers.length - 1);
		System.out.println("**** クイックソート完了 ****");
	}
}
