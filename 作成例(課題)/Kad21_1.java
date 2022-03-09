import java.util.Scanner;
import java.util.Random;

public class Kad21_1{
	
	/**
	 * �R���s���[�^�Ƃ���񂯂�
	 */
	public static void main(String[] args){
		
		final String[] HAND = {"�O�[", "�`���L", "�p�["};
		final String[] RESULT = {"���������I", "������������I", "���������I"};
		
		System.out.println("�R���s���[�^�Ƃ���񂯂񏟕��I");
		System.out.print("[0->�O�[ 1->�`���L 2->�p�[]��");
		try{
			//�v���C���[�̎����́��\��
			Scanner sc = new Scanner(System.in);
			int pHand = Integer.parseInt(sc.next());
			System.out.println("�v���C���[�F" + HAND[pHand]);
			//�R���s���[�^�̎�����聕�\��
			Random ra = new Random();
			int cHand = ra.nextInt(3);
			System.out.println("�R���s���[�^�F" + HAND[cHand]);
			
			//�v���C���[���_�̌��ʂ�\��
			System.out.println(RESULT[(pHand - cHand + 3) % 3]);
			
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println("���͒l���͈͊O�ł��B");
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}
	}
}
