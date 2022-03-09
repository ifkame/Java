import java.util.Scanner;

public class Kad17_1{

	//線形探索（リニアサーチ）
	//@param data 検索対象の配列
	//@param key 検索文字列
	public static int linearSearch(String[] data, String key){
		//検索対象の配列の数だけループ
		for(int i = 0; i < data.length; i++){
			//検索対象の文字列と検索文字列が一致したとき
			//一致した番号を返却
			if(key.equals(data[i])){
				return i + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		
		String[] fruitsArray = {"リンゴ", "レモン", "メロン", "バナナ", "イチゴ" };
		
		System.out.println("配列のデータは以下の通りです。");
		
		for(String fruits : fruitsArray){
			System.out.println(fruits);
		}
		
		System.out.print("検索文字＞");
		Scanner sc = new Scanner(System.in);
		String inStr = sc.next();	//検索文字を入力し格納
		
		//リニアサーチを呼び出し、戻り値をindexに格納
		int result = linearSearch(fruitsArray, inStr);
		
		if(result == -1){
			System.out.println(inStr + "は見つかりませんでした。");
		}else{
			System.out.println(inStr + "は" + result + "番目に見つかりました。");
		}
	}
}
