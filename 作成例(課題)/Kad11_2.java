import java.util.Scanner;
import java.util.Random;	//Random�N���X�C���|�[�g��

public class Kad11_2{
	public static void main(String[] args){
		
		final int MAXROLL = 6;	//�o�ڂ̍ő�l
		int total = 0;			//���v�l
		
		System.out.println(MAXROLL + "�ʃ_�C�X��U�����o�ڂ̕��ϒl�����߂܂��B");
		System.out.print("�U��񐔁�");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		Random ra = new Random();	//Random�N���X�I�u�W�F�N�g�쐬
		
		for(int i = 1 ; i <= count; i++){
			int dice = ra.nextInt(MAXROLL) + 1;	//�_�C�X��U��
			System.out.println(i + "��ځF" + dice);
			total += dice;	//���v�l�ɉ��Z
		}
		
		System.out.println("���ϒl�F" + (double)total / count);
	}
}
