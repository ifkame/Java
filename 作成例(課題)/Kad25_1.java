import java.util.Scanner;

public class Kad25_1{
	/**
	 * ����Ƃ�
	 * �ŏ��́u��v����n�܂�A�����Ɂu��v���t���ƏI������B
	 * �ȉ��̌��t�����͂��ꂽ�ꍇ�ē��͂�����B
	 * 1.���͂��錾�t���R��������
	 * 2.���������O��̖��������ƈႤ
	 * �����̕������L�΂��_�i�[�j�������ꍇ�A���̂P�O�̕��������̓������Ƃ���B
	 */
	public static void main(String[] args){
		
		final int MINLEN = 3;		//���e����ŏ�������
		final char ENDCHAR = '��';	//�I������
		char initial = '��';		//���t�̓������i�O��̖��������j
		String word;				//���t�i�[�ϐ�
		
		System.out.println("����Ƃ�I�����Ɂu" + ENDCHAR + "�v���t������I��");
		
		Scanner sc = new Scanner(System.in);
		while(initial != ENDCHAR){
			System.out.print("\n�u" + initial + "�v����n�܂錾�t(" + MINLEN + "�����ȏ�)��");
			word = sc.next();
			
			//���͂��������񂪋��e�����ŏ������������̏ꍇ
			if(word.length() < MINLEN){
				System.out.println("������������܂���B");
				continue;
			}
			
			//���͂���������̓��������O��̖��������Ɠ������Ȃ��ꍇ
			if(word.charAt(0) != initial){
				System.out.println("���������Ԉ���Ă��܂��B");
				continue;
			}
			//���͂���������̖������L�΂��_�i�[�j�̏ꍇ
			if(word.charAt(word.length() - 1) == '�['){
				initial = word.charAt(word.length() - 2);	//�����̑O�̕��������̓�������
			}else{
				initial = word.charAt(word.length() - 1);	//�����̕��������̓�������
			}
		}
		System.out.println("\n�I�����܂��B");
	}
}