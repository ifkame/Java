public class Kad19_1{
	
	//挿入ソート
	public static void insertSort(int[] data) {
		
		//0番目をソート済みとし、1番目から末尾までループ
		for(int i = 1; i < data.length; i++){
			int tmp = data[i];	//挿入するデータを退避
			if(data[i - 1] > tmp){	//退避データより、ソート済みの末尾の値が大きい場合
				int j = i;
				do{
					data[j] = data[j - 1];	//1つ右の要素に値を移す
					j--;
				}while(j > 0 && data[j - 1] > tmp);	
				data[j] = tmp;	//退避データを適切な位置に挿入する。
			}
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
		System.out.println("****** 挿入ソート開始 ******");
		insertSort(numbers);
		System.out.println("****** 挿入ソート完了 ******");
	}
}