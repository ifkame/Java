import java.util.Scanner;
import java.util.Random;

public class Kad26_2{
	//�t�B�b�V���[-�C�F�[�c�̃V���b�t��
	public static void shuffle(int[] data){
		int i, j, tmp;	//�J�E���^�E�ޔ�ϐ�
		for(i = data.length - 1; i > 0; i--){
			j = new Random().nextInt(i + 1);
			tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}
	
	/**
	 * �}�X�^�[�}�C���h
	 * 0~9�̏d�����Ă��Ȃ����l�𓖂Ă�Q�[���ł��B
	 * ���l���𓚂��A���̐��l�̈ʒu�Ɛ��������Ă���ꍇ��EAT�A
	 * �ʒu�͈Ⴄ�����������Ă���ꍇ��BITE��Ԃ��A���̏��𗊂��
	 * ���l���i���Ă����A��������EAT���o����N���A�ƂȂ�܂��B
	 */
	public static void main(String[] args){
		
		final int DIGIT = 4;			//����(1~10�܂�)
		int[] answer = new int[DIGIT]; 	//�𓚔z��
		int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//�@�yKad26_2�Œǉ��z
		int count = 0;	//�������񐔂̃J�E���^
		int eat = 0;	//�ʒu�����l�������Ă��鐔
		int bite = 0;	//�ʒu�͈Ⴄ���A���l�͍����Ă��鐔
		String inStr;	//���͕����i�[�ϐ�
		int[] inNum = new int[DIGIT];	//���͒l��1�����������i�[����z��
		
		shuffle(number);	//���ƂȂ鐔�l�z����V���b�t������
		
		//�V���b�t�������z��̐擪���猅�����o���A�𓚔z��Ɋi�[����
		for(int i = 0; i < DIGIT; i++){
			answer[i] = number[i];
		}
		
		//�yKad26_2�ł�������ǉ��z-----------------
		
		System.out.println("�}�X�^�[�}�C���h�I" + DIGIT + "���̐��l�𓖂Ă悤");
		while(eat != DIGIT){	//�A
			try{
				System.out.print("\n���l�𓖂ĂĂ���������");
				inStr = new Scanner(System.in).next();	//�B0�������ׁA�����Ƃ��Ď󂯎��
				
				//�C�����`�F�b�N(�ꎞ�I�ɕ����ɕϊ����A�������擾����)
				if(inStr.length() != DIGIT){
					System.out.println("�������Ⴂ�܂��B");
					continue;
				}
				
				//�D���͕�����擪����1�����������A���l�ɕϊ������Ĕz��Ɋi�[����
				for(int i = 0 ; i < DIGIT; i++){
					inNum[i] = Integer.parseInt(inStr.substring(i, i + 1));
				}
				
				//�EEAT�EBITE����
				eat = 0; bite = 0;					//���Z�b�g
				for(int i = 0; i < DIGIT; i++){			//�𓚔z����Ȃ���
					for(int j = 0; j < DIGIT; j++){		//���͔z����Ȃ���
						if(answer[i] == inNum[j]){	//���l����v�����ꍇ
							if(i == j){				//�ʒu����v���Ă���ꍇ
								eat++;
							}else{					//�ʒu����v���Ă��Ȃ��ꍇ
								bite++;
							}
							break;
						}
					}
				}
				//�F�������񐔂̃J�E���^���C���N�������g���A���ʂ�\������
				System.out.println(++count + "��ځF" + eat + "EAT " + bite + "BITE");
			}catch(NumberFormatException nfe){	//�D
				System.out.println("���͒l���s���ł��B");	
			}
		}
		System.out.println("\nCLEAR!!");
	}
}