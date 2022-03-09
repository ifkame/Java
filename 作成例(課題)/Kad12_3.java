import java.util.Scanner;

public class Kad12_3{
	
	enum Character{�E��, ����, ���@�g��, �m��}
	
	public static void main(String[] args){
		
		final int[] POWER = {100, 80, 20, 40};	//�L�����N�^�[�ʂ̒ʏ�U���_���[�W
		final int[] MAGIC = {70, 50, 120, 80};	//�L�����N�^�[�ʂ̖��@�U���_���[�W
		int i = 0;	//�L�����N�^�[�J�E���^�i0->�E�� 1->���� 2->���@�g�� 3->�m���j
		int hitPoint = 300;	//�����̗̑�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********** ECC QUEST **********");
		System.out.println("���������ꂽ�I��");
		System.out.println("�u�P�ʂ��~�����΂P�^�[���Ŏ���|���Ă݂�I�v\n");
		
		for(Character c : Character.values()) {
			//�s������
			System.out.print(c + "�͂ǂ�����H[1->�ʏ�U�� 2->���@�U�� ��->������]��");
			int action = sc.nextInt();
			
			//�s������
			switch(action){
			case 1:
				System.out.println(c + "�̒ʏ�U���I " + POWER[i] + "�_���[�W�I��");
				hitPoint -= POWER[i];
				break;
			case 2:
				System.out.println(c + "�̖��@�U���I" + MAGIC[i] + "�_���[�W�I��");
				hitPoint -= MAGIC[i];
				break;
			default:
				System.out.println(c + "�͓����������I ��������荞�܂ꂽ�I��");
				break;
			}
			
			//��������
			if(hitPoint <= 0){
				System.out.println("\n������|�����I��\n�P�ʂ���ɓ��ꂽ�I");
				System.out.println("********** GAME CLEAR **********");
				break;
			}else{
				i++;	//���̃L�����N�^�[��
			}
			
			//�s�k����
			if(i == Character.values().length){
				System.out.println("\n������|���Ȃ������I��\n�P�ʂ���ꂸ���N�����I");
				System.out.println("********** BAD END **********");
			}
		}
	}
}
