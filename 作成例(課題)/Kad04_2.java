import java.util.Scanner;	//Scanner�N���X���g�p���邽�߂̃C���|�[�g��

public class Kad04_2{
	public static void main(String[] args){
		
		System.out.println("2�̐�������͂��ĉ������B");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����a��");
		int a = sc.nextInt();
		
		System.out.print("����b��");
		int b = sc.nextInt();
		
		if(a < b){
			int add = a + b;
			System.out.println(a + " �{ " + b + " = " + add);
			int mul = a * b;
			System.out.println(a + " �~ " + b + " = " + mul);
	    }else{
			int sub = a - b;
			System.out.println(a + " �| " + b + " = " + sub);
			int div = a / b;
			int rem = a % b;
			System.out.println(a + " �� " + b + " = " + div + " ���܂� " + rem);
		}
	}
}
