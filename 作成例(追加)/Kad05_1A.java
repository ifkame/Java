import java.util.Scanner;

public class Kad05_1A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3�Ŋ���؂����]����v�Z���܂��I");
		System.out.print("��������͂��Ă���������");
		int num = sc.nextInt();
		
		switch(num % 3){
			case 0:
			System.out.println("����؂�܂����I");
			break;
			case 1:
			System.out.println("�]���1�ł��I");
			break;
			case 2:
			System.out.println("�]���2�ł��I");
			break;
		}
	}
}