import java.util.Scanner;

public class Kad16_1{
	
	//ランレングス法
	public static String runLength(String data){
		
		int i = 0; 				// 文字列インデックス
		int count = 1;			// 文字数カウンタ
		String outStr = "";		// 出力文字
		String subStr;			// 部分文字
		
		//先頭文字を抜き出す
		subStr = data.substring(i, i + 1);
		
		//入力文字列(inStr)の文字数分繰り返す（先頭を除く）
		for(i = 0; i < data.length() - 1; i++){
			
			//次の文字を抜き出し、比較する
			if(subStr.equals(data.substring(i + 1, i + 2))){
				//同じ文字が続く場合はcountを+1する
				count++;
			}else{
				//違う文字に遭遇したら繰り返し文字と回数を出力文字変数に連結する
				outStr += " $" + subStr + ":" + count;
				//次の文字を抜き出し、部分文字を更新する
				subStr = data.substring(i + 1, i + 2);
				//カウンタを初期化する
				count = 1;
			}
		}
		
		//最後の文字と回数を出力文字格納変数に連結する
		outStr += " $" + subStr + ":" + count;
		//出力文字を返す
		return outStr;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("文字列＞");
		String inStr = sc.next();	// 入力文字格納変数
		
		System.out.println(runLength(inStr));	//ランレングスメソッド呼び出し
	}
}