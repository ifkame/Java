import java.util.Scanner;

public class Kad07_2{
	public static void main(String[] args){
		
		System.out.println("�l�p�`��`�悵�܂��B");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�s����");
		int row = sc.nextInt();
		System.out.print("�񐔁�");
		int col = sc.nextInt();
		
		//�s�̃��[�v
		for(int i = 1; i <= row; i++){
			//��̃��[�v
			for(int j = 1; j <= col; j++){
				System.out.print("��");
			}
			System.out.println("");	//���s
		}
	}
	
}
