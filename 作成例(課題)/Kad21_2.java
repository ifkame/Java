import java.util.Scanner;
import java.util.Random;

public class Kad21_2{
	
	/**
	 * ���̃R���s���[�^�Ƃ���񂯂�
	 */
	public static void main(String[] args){
		
		final int ENDPOINT = 3;		//�I���|�C���g
		final String[] HAND = {"�O�[", "�`���L", "�p�["};
		final String[] RESULT = {"���������I", "������������I", "���������I"};
		int point = 0;				//�v���C���[�̃|�C���g
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		
		System.out.println("���̃R���s���[�^�Ƃ���񂯂񏟕��I");
		
		//�I���|�C���g�ɖ����Ȃ��ԃ��[�v
		while(point < ENDPOINT){
			System.out.print("\n[0->�O�[ 1->�`���L 2->�p�[]��");
			try{
				//�v���C���[�̎����́��\��
				int pHand = Integer.parseInt(sc.next());
				System.out.println("�v���C���[�F" + HAND[pHand]);
				//�R���s���[�^1�̎�����聕�\��
				int c1Hand = ra.nextInt(3);
				System.out.println("�R���s���[�^�P�F" + HAND[c1Hand]);
				//�R���s���[�^2�̎�����聕�\��
				int c2Hand = ra.nextInt(3);
				System.out.println("�R���s���[�^�Q�F" + HAND[c2Hand]);
				
				//���Ҕ���E�o������̍��v��3�Ŋ������]�肪�A
				switch((pHand + c1Hand + c2Hand) % 3){
				//0�̏ꍇ�͂�����
				case 0: 
					System.out.print(RESULT[0]);
					break;
				//1�̏ꍇ�͓�l����
				case 1:
					//�R���s���[�^1��2��������̏ꍇ�A
					if(c1Hand == c2Hand){
						System.out.print(RESULT[1]);	//�v���C���[�s�k
					}else{
						System.out.print(RESULT[2]);	//�v���C���[����
						point++;
					}
					break;
				//2�̏ꍇ�͈�l����
				case 2:
					//�R���s���[�^1��2��������̏ꍇ�A
					if(c1Hand == c2Hand){
						System.out.print(RESULT[2]);	//�v���C���[����
						point++;
					}else{
						System.out.print(RESULT[1]);	//�v���C���[�s�k
					}
				}
				System.out.println("(" + point + "��)");
			}catch(ArrayIndexOutOfBoundsException aioobe){
				System.out.println("���͒l���͈͊O�ł��B");
			}catch(NumberFormatException nfe){
				System.out.println("���͒l���s���ł��B");
			}
		}
	}
}
