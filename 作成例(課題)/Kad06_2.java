import java.util.Scanner;

public class Kad06_2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int flag;	//�p���t���O
		
		do{
			System.out.print("������");
			int num = sc.nextInt();
			
			if(num % 2 == 0){
				System.out.println("�����ł��B");
			}else{
				System.out.println("��ł��B");
			}
			
			System.out.print("[0->�I�� 1->�p��]��");
			flag = sc.nextInt();
		}while(flag == 1);
		System.out.println("�I�����܂��B");
	}
}
