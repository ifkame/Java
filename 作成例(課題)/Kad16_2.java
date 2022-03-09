import java.util.Scanner;

public class Kad16_2{
	
	//力まかせ法(探索成功:0以上, 探索失敗:-1)
	public static int bruteForce(String data, String search){
		
		int dc = 0;	//data(探索対象文字列)をなぞるカーソル
		int sc = 0;	//search(検索文字列)をなぞるカーソル
		
		//両カーソルがそれぞれの文字列の末尾に辿りつくまでループ
		while(dc != data.length() && sc != search.length()){
			//探索対象文字列と検索文字列から抜き出した1文字が一致している場合
			if(data.charAt(dc) == search.charAt(sc)){
				//次の文字へカーソル移動
				dc++;	
				sc++;
			}else{	//不一致の場合
				dc = dc - sc + 1;	//探索済み文字列の次の文字へカーソル移動
				sc = 0;				//検索文字列の先頭の文字へカーソル移動
			}
		}
		
		//検索文字列カーソル位置が検索文字数と同じ（完全一致した）場合
		if(sc == search.length()){
			return dc - sc + 1;	//探索成功
		}
		return -1;	//探索失敗
	}
	
	public static void main(String[] args){
		
		final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println("データ：" + ALPHABET);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("検索文字列＞");
		String inStr = sc.next();
		
		//力まかせ探索を行い、結果を格納する
		int result = bruteForce(ALPHABET, inStr);
		if(result == -1){
			System.out.println(inStr + "は見つかりませんでした。");
		}else{
			System.out.println(inStr + "は" + result + "文字目に見つかりました。");
		}
	}
}