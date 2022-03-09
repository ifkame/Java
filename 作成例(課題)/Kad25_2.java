import java.util.Scanner;
import java.util.Random;

public class Kad25_2{
	/**
	 * ���[�h�o�X�P�b�g
	 * 
	 * �Q�[���J�n���A���`���44�����烉���_���ɕ�����I�т������D�Ƃ���i�����̏d������j
	 * ����Ƃ�̃��[���{���Ƃ��Ė�������D�̕����̌��t����͂����炻�̎�D�������B
	 * �S�Ă̎�D������ł�����N���A�A�Ƃ����Q�[���ł��B
	 * 
	 * Kad25_1�����ɏ�����ǉ��E�ύX���܂��B
	 */
	public static void main(String[] args){
		
		final int MINLEN = 3;		//���e�����ŏ�������
		final char ENDCHAR = '��';	//�I������
		char initial = '��';		//���t�̓������i�O��̖��������j
		String word;				//���t�i�[�ϐ�
		
		//�y25_2�Œǉ��z
		int hand = 4;					//��D����
		char[] handText = new char[hand];	//��D�i�[�z��
		//��D���Ђ炪�ȕ���
		final String HIRAGANA = "������������������������������" +
								"�����ĂƂȂɂʂ˂̂͂Ђӂւ�" +
								"�܂݂ނ߂�����������";
		
		//��D�����肷��
		Random ra = new Random();
		for(int i = 0; i < handText.length; i++){
			handText[i] = HIRAGANA.charAt(ra.nextInt(HIRAGANA.length()));
		}
		
		System.out.println("���[�h�o�X�P�b�g�I��D�̕����ŏI��錾�t�𓚂��悤");
		
		Scanner sc = new Scanner(System.in);
		while(hand > 0){
			
			//��D�\��
			System.out.print("\n��D�F");
			for(char c : handText){
				System.out.print(c + "�@");
			}
			
			System.out.print("\n�u" + initial + "�v����n�܂錾�t(" + MINLEN + "�����ȏ�)��");
			word = sc.next();
			
			//���͂��������񂪋��e�����ŏ������������̏ꍇ
			if(word.length() < MINLEN){
				System.out.println("������������܂���B");
				continue;
			}
			
			//���͂���������̐擪�����Ɠ��������������Ȃ��ꍇ
			if(word.charAt(0) != initial){
				System.out.println("���������Ԉ���Ă��܂��B");
				continue;
			}
			
			//���͂���������̖������u��v�̏ꍇ
			if(word.charAt(word.length() - 1) == ENDCHAR){
				System.out.println("�����Ɂu" + ENDCHAR + "�v���t���Ă��܂��B");
				continue;
			}
			
			//���͂���������̖������L�΂��_�i�[�j�̏ꍇ
			if(word.charAt(word.length() - 1) == '�['){
				initial = word.charAt(word.length() - 2);	//�����̑O�̕��������̓�������
			}else{
				initial = word.charAt(word.length() - 1);	//�����̕��������̓�������
			}
			
			//������������D�̒��ɂ��邩�ǂ����T������
			for(int i = 0; i < handText.length; i++){
				//��������
				if(handText[i] == initial){
					handText[i] = '�@';		//�������D���󕶎��ɕύX
					hand--;			//��D���P�����炷
					break;				//�T���I��
				}
			}
		}
		System.out.println("\nCLEAR!!");
	}
}