import java.util.Scanner;

public class Kad20_1{

	//�K������߂�ċA�Ăяo���֐�
	public static int func(int i) {
		if(i > 1) {
			return(i * func(i - 1));
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args){
		
		System.out.print("�K������߂܂�(0~10)��");
		
		Scanner sc = new Scanner(System.in);
		try{
			int inNum = Integer.parseInt(sc.next());
			
			if(0 <= inNum && inNum <= 10) {	//1����10�̐��l����t�\
				System.out.println(inNum + "�̊K���" + func(inNum) + "�ł��B");
			} else {
				System.out.println("���͒l���͈͊O�ł��B");
			}
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}
	}
}
