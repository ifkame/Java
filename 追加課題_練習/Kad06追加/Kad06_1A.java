import java.util.Scanner;

public class Kad06_1A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����S�̐�����͂��Ă���������");
		int apple = sc.nextInt();
		System.out.print("�H�ׂ�l�̐�����͂��Ă���������");
		int eater = sc.nextInt();
		
		if (apple >= eater) {
			System.out.println("��l�ЂƂ������S��H�ׂ��I");
			apple -= eater;
		}
		System.out.println("�]���������S��" + apple + "�ł��I");
	}
}
