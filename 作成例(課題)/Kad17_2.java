import java.util.Scanner;

public class Kad17_2{

	//二分探索（バイナリサーチ）
	//@param data 検索対象の配列
	//@param key 検索文字列
	public static int binarySearch(int[] data, int key){
		
		int left = 0;					//最小値のある位置
		int right = data.length - 1;	//最大値のある位置
		int center;						//中央値のある位置
		
		while(left <= right){				//最小値のある位置より最大値のある位置が大きい間ループ
			center = (left + right) / 2;	//中央値計算
			if(key > data[center]){				//検索値が中央値より大きいとき
				left = center + 1;		//最小値を中央値＋１の位置にずらす
			}else if(key < data[center]){		//検索値が中央値より小さいとき
				right = center - 1;		//最大値を中央値ー１の位置にずらす
			}else{								//それ以外の（中央値と一致した）とき
				return center + 1;		//見つけた中央値＋１を返却
			}
		}
		return -1;
	}

	public static void main(String[] args){
		
		int[] numbers = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.println("配列のデータは以下の通りです。");
		
		for(int num : numbers){
			System.out.println(num);
		}
		
		System.out.print("検索数値＞");
		Scanner sc = new Scanner(System.in);
		
		try{
			int inNum = Integer.parseInt(sc.next());
			
			//バイナリサーチを呼び出し、戻り値をindexに格納
			int index = binarySearch(numbers, inNum);
			
			if(index == -1){
				System.out.println(inNum + "は見つかりませんでした。");
			}else{
				System.out.println(inNum + "は" + index + "番目に見つかりました。");
			}
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}
	}
}
