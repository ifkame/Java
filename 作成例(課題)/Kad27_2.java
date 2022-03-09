import java.util.Scanner;

public class Kad27_2{
	/**
	 * シーザー暗号
	 */
	public static String caesar(String plainText, int shift){
		
		//使用可能文字一覧（今回は半角英数字のみ）
		final String LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		final int LISTLEN = LIST.length();	//LISTの長さ
		
		String shiftList;	//シフト後のLIST格納用
		
		//shift数が0の場合は平文をそのまま返す(暗号化無し)
		if(shift == 0){
			return plainText;
		}else if(shift < 0){
			//shift数が0より小さい（右シフトの）場合、shift数を左シフト用に反転する
			shift = LIST.length() + (shift % LISTLEN);
		}
		
		//shift数分、LIST文字列を左にシフトする
		shiftList = LIST.substring(shift % LISTLEN, LISTLEN) + LIST.substring(0, shift % LISTLEN);
		
		String secretMessage = "";	//暗号文
		
		//暗号文作成。平文の文字数分ループする
		for(int i = 0; i < plainText.length(); i++){
			//平文のi文字のインデックスを取得する
			int plainTextIndex = LIST.indexOf(plainText.charAt(i));
			//インデックスが見つからなかった（半角英数字以外の）場合、?に置き換える
			if(plainTextIndex == -1){
				secretMessage += "?";
			}else{
				secretMessage += shiftList.charAt(plainTextIndex);
			}
		}
		
		//暗号文を返す
		return secretMessage;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** シーザー暗号 ***");
		System.out.print("平文 (半角英数字)＞");
		String inStr = sc.next();
		try{
			System.out.print("シフト数＞");
			int inNum = Integer.parseInt(sc.next());
			System.out.print("暗号文：" + caesar(inStr, inNum));
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}
	}
}
