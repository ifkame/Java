import java.util.Scanner;

public class Kad05_3{
	public static void main(String[] args){
		
		System.out.println("*** 3��̏��Z ***");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����1��");
		int num1 = sc.nextInt();
		System.out.print("����2��");
		int num2 = sc.nextInt();
		
		//���鐔��0�̏ꍇ
		if(num2 == 0){
			System.out.println("0�Ŋ��邱�Ƃ͏o���܂���B");
		}else{
			System.out.print("[1->���Z 2->�������Z 3->��]�Z]��");
			int operation = sc.nextInt();
			
			switch(operation){
			case 1:	//���Z
				System.out.println(num1 + " �� " + num2 + " �� " + (double)num1 / num2);
				break; 
			case 2:	//�������Z
				System.out.println(num1 + " �� " + num2 + " �� " + num1 / num2);
				break; 
			case 3:	//��]�Z
				System.out.println(num1 + " �� " + num2 + " �� " + num1 / num2 + " ���܂� " + num1 % num2);
				break; 
			default:
				System.out.println("���Z���@���͈͊O�ł��B");
				break; 
			}
		}
	}
}
