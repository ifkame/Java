import java.util.Scanner;

public class Kad09_1{
	public static void main(String[] args){
		
		//��Ԓ��\
		int[][] fare = {{  0, 150, 240, 360},
						{150,   0, 170, 270},
						{240, 170,   0, 190},
						{360, 270, 190,   0}};
						
		Scanner sc = new Scanner(System.in);
		System.out.print("��Ԓ◯��(1~4)��");
		int row = sc.nextInt();
		
		System.out.print("�~�Ԓ◯��(1~4)��");
		int col = sc.nextInt();
		
		//��ԉw�ƍ~�ԉw�������ꍇ
		if(row == col){
			System.out.println("�����◯���ł��B");
			
		//1~4�ȊO�̐��l����͂����ꍇ
		}else if(row < 1 || row > 4 || col < 1 || col > 4){
			System.out.println("1~4�̐��l����͂��Ă��������B");
			
		}else{
			System.out.println(row + "����" + col + "�܂ł̏�Ԓ���" + fare[row - 1][col - 1] + "�~�ł��B");
		}
	}
}
