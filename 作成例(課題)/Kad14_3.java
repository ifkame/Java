import java.util.Scanner;

public class Kad14_3{
	
	//���邤�N����
	public static boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			return true;
		}
		return false;
	}
	
	//���̍ŏI����Ԃ�
	public static int getDayOfMonth(int year, int month) {
		//1~12���̍ŏI��
		final int[] LASTDAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//2�����AisLeapYear���\�b�h�̖߂�l��true�̏ꍇ
		if(month == 2 && isLeapYear(year)) {
			return LASTDAYS[month - 1] + 1;		//28����29��
		}
		return LASTDAYS[month - 1];
	}
	
	public static void main(String[] args){
		
		System.out.println("���錎�̓��������߂܂��B");
		
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("���");
			int year = Integer.parseInt(sc.next());
			System.out.print("����");
			int month = Integer.parseInt(sc.next());
			System.out.println(year + "�N" + month + "���̍ŏI����" + getDayOfMonth(year, month) + "���ł��B");
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("���̌��͑��݂��܂���B");
		}
	}
}
