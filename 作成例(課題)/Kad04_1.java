import java.util.Scanner;	//Scanner�N���X���g�p���邽�߂̃C���|�[�g��

public class Kad04_1{
	 public static void main(String[] args){
	 	
	 	Scanner sc = new Scanner(System.in);
		System.out.print("���O��");
		String name = sc.next();
		System.out.println(name + "���񂱂�ɂ��́B");
		
		System.out.print("\n�N�");
		int age = sc.nextInt();
		System.out.println(age + "�΂Ƃ���ƁA10�N���" + (age + 10) + "�΂ł��ˁB");
	 }
}