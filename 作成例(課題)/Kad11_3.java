import java.util.Scanner;
import java.util.Random;	//Random�N���X�C���|�[�g��

public class Kad11_3{
	//���s���p�����[�^�Ɂi�R�}���h���C�������j��[��g �g ���g ���g ���g ��]��ݒ肷��
	public static void main(String[] args){
		
		System.out.println("���݂������������e���ʂ̉񐔂����߂܂��B");
		System.out.print("�����񐔁�");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		//�e���ʂ̉񐔂��i�[����z��
		int[] results = new int[args.length];
		
		Random ra = new Random();	//Random�N���X�I�u�W�F�N�g�쐬
		
		for(int i = 1; i <= count; i++){
			int ransu = ra.nextInt(args.length);	//0~5�̗�������
			System.out.println(i + "��ځF" + args[ransu]);
			results[ransu]++;	//���������ʂ̉񐔂�1���₷
		}
		
		System.out.println("\n*** ���ʕ\�� ***");
		//���ʕ\��
		for(int i = 0; i < results.length; i++){
			System.out.println(args[i] + "�F" + results[i] + "��");
		}
	}
}
