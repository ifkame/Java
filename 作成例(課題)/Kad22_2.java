import java.util.Scanner;

public class Kad22_2{
	
	/**
	 * �Ύ��Q�[��
	 * 20�̐΂�2�l�����݂�1~4��荇���A�Ō��1������Ă��܂������������B
	 * ���̉ۑ�̃R���s���[�^�͕K���p�^�[���Ő������A�v���C���[���K��������B
	 */
	public static void main(String[] args){
		
		final String[] TURN = {"�R���s���[�^", "�v���C���["};
		final int STONE = 20;	//�����̐΂̐�
		final int TAKEMAX = 4;	//����ő吔
		int remStone = STONE;	//�c��̐΂̐�
		int takeStone= 0;		//������΂̐�
		int turnFlag = 0;		//�^�[���t���O(0:�R���s���[�^ 1:�v���C���[)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ŋ��R���s���[�^�ƐΎ�菟���I");
		while(remStone > 0){
			//�c��̐΂�\��
			System.out.print("\n�c��F");
			for(int i = 0; i < remStone; i++){
				System.out.print("��");
			}
			
			System.out.print("\n" + TURN[turnFlag] + "�̃^�[���I");
			try{
				//�R���s���[�^�̃^�[��
				if(turnFlag == 0){
					//�K���p�^�[���ł̐����擾
					takeStone = (TAKEMAX + remStone) % (TAKEMAX + 1);	//�y�ύX���镔���͂��������z
					//���������\��
					System.out.println(TURN[turnFlag] + "��" + takeStone +"������I");
				}else{
					//�v���C���[�̃^�[��
					System.out.print("�����܂����H(1~" + TAKEMAX + ")��");
					takeStone = Integer.parseInt(sc.next());
					//1-TAKEMAX�͈͈̔ȊO�͕s���Ƃ��A�ē��͂�����
					if(takeStone < 1 || takeStone > TAKEMAX){
						System.out.println("���͒l���͈͊O�ł��B");
						continue;
					}
				}
				//�c��̐΂̐����������΂̐������炷
				remStone -= takeStone;
				
				//�c��̐΂̐���1�����ɂȂ����ꍇ�A�^�[���v���C���[�s�k
				if(remStone < 1){
					System.out.println("\n�����F" + TURN[turnFlag] + "�̕����I");
				}
				//�^�[���t���O�؂�ւ�(0 ���� 1)
				turnFlag = 1 - turnFlag;
			}catch(NumberFormatException nfe){
				System.out.println("���͒l���s���ł��B");
			}
		}
	}
}