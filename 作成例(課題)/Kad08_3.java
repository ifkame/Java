public class Kad08_3{
	public static void main(String[] args){
		
		char[] letters = {'E', 'C', 'C', 'コ', 'ン', 'ピ', 'ュ', 'ー', 'タ'};
		
		System.out.println("配列の値を逆順に並び替えて先頭から表示します。");
		//交換処理
		for(int i = 0; i < letters.length / 2; i++){
			char tmp = letters[i];	//一時退避
			letters[i] = letters[letters.length - (i + 1)];	
			letters[letters.length - (i + 1)] = tmp;
		}
		
		//表示処理
		for(int i = 0; i < letters.length; i++){
			System.out.print(letters[i]);
		}
	}
}
