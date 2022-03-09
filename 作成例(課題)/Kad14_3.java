import java.util.Scanner;

public class Kad14_3{
	
	//うるう年判定
	public static boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			return true;
		}
		return false;
	}
	
	//月の最終日を返す
	public static int getDayOfMonth(int year, int month) {
		//1~12月の最終日
		final int[] LASTDAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//2月かつ、isLeapYearメソッドの戻り値がtrueの場合
		if(month == 2 && isLeapYear(year)) {
			return LASTDAYS[month - 1] + 1;		//28日→29日
		}
		return LASTDAYS[month - 1];
	}
	
	public static void main(String[] args){
		
		System.out.println("ある月の日数を求めます。");
		
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("西暦＞");
			int year = Integer.parseInt(sc.next());
			System.out.print("月＞");
			int month = Integer.parseInt(sc.next());
			System.out.println(year + "年" + month + "月の最終日は" + getDayOfMonth(year, month) + "日です。");
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("その月は存在しません。");
		}
	}
}
