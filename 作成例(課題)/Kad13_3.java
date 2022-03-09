import java.util.Scanner;

public class Kad13_3{
	public static void main(String[] args){
		
		int[] data = {100, 200, 300};
		
		System.out.println("配列の値は以下の通りです。");
		for(int i = 0; i < data.length; i++){
			System.out.println("data[" + i + "] = " + data[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nどの要素の値を取り出しますか？＞");
		try {
			int n = Integer.parseInt(sc.next());
			System.out.println(data[n] + "を取り出しました。");	
		}catch(NumberFormatException nfe){
			System.out.println(nfe);
			System.out.println("入力値を整数に変換できません。");
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println(aioobe);
			System.out.println("その要素は存在しません。");
		}
	}
}
