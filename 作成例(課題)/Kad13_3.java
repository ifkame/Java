import java.util.Scanner;

public class Kad13_3{
	public static void main(String[] args){
		
		int[] data = {100, 200, 300};
		
		System.out.println("�z��̒l�͈ȉ��̒ʂ�ł��B");
		for(int i = 0; i < data.length; i++){
			System.out.println("data[" + i + "] = " + data[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n�ǂ̗v�f�̒l�����o���܂����H��");
		try {
			int n = Integer.parseInt(sc.next());
			System.out.println(data[n] + "�����o���܂����B");	
		}catch(NumberFormatException nfe){
			System.out.println(nfe);
			System.out.println("���͒l�𐮐��ɕϊ��ł��܂���B");
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println(aioobe);
			System.out.println("���̗v�f�͑��݂��܂���B");
		}
	}
}
