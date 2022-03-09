public class Kad19_2{
	
	//シェルソート
	public static void shellSort(int[] data) {
		
		int h = data.length / 2;	//5→2→1→0
		
		//間隔が0より大きい間ループする
		while(h > 0){
			//間隔番目の要素からスタートし、データ列の長さまでループする
			for(int i = h; i < data.length; i++){
				//jを比較初期位置とする
				int j = i;
				//比較する要素番号が間隔以上、かつ間隔分離れた左側の要素が大きい間ループする
				while(j >= h && data[j - h] > data[j]){
					//交換処理
					int tmp = data[j];
					data[j] = data[j - h];
					data[j - h] = tmp;
					//比較要素を更新(5→0, 6→1...)
					j -= h;
				}
			}
			h /= 2;	//間隔を更新5→2→1→0
			printArray(data);	//配列の値を表示
		}
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
		System.out.println("***** シェルソート開始 *****");
		shellSort(numbers);
		System.out.println("***** シェルソート完了 *****");
	}
}