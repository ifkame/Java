import java.util.Scanner;	//Scanner�N���X���g�p���邽�߂̃C���|�[�g��

public class Kad04_3 {
	public static void main(String[] args){
		
		System.out.println("3�̐�������͂��ĉ������B");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����a��");
		int a = sc.nextInt();
		
		System.out.print("����b��");
		int b = sc.nextInt();
		
	    System.out.print("����c��");
		int c = sc.nextInt();
		
		if (a == b && b == c) {
			System.out.println("�S�ē����l�ł��B");
		}else if(a == b || b == c || c == a){
			System.out.println("2�̒l�������ł��B");
		}else{
	        System.out.println("3�̒l�͈قȂ�܂��B");
		}
	}

}
