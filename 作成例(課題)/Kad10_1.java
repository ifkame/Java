public class Kad10_1{
	public static void main(String[] args){
		
		char[] letters = {'コ', 'ン', 'ピ', 'ュ', 'ー', 'タ'};
		String concat = "";	//連結文字列
		
		System.out.println("*** 拡張for文で配列の値を表示 ***");
		for(char letter : letters){
			System.out.println(letter);
			concat += letter;	//文字連結
		}
		
		System.out.println("*** 連結した結果を表示 ***");
		System.out.println(concat);
	}
}