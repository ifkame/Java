import java.util.Scanner;

public class Kad27_2{
	/**
	 * �V�[�U�[�Í�
	 */
	public static String caesar(String plainText, int shift){
		
		//�g�p�\�����ꗗ�i����͔��p�p�����̂݁j
		final String LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		final int LISTLEN = LIST.length();	//LIST�̒���
		
		String shiftList;	//�V�t�g���LIST�i�[�p
		
		//shift����0�̏ꍇ�͕��������̂܂ܕԂ�(�Í�������)
		if(shift == 0){
			return plainText;
		}else if(shift < 0){
			//shift����0��菬�����i�E�V�t�g�́j�ꍇ�Ashift�������V�t�g�p�ɔ��]����
			shift = LIST.length() + (shift % LISTLEN);
		}
		
		//shift�����ALIST����������ɃV�t�g����
		shiftList = LIST.substring(shift % LISTLEN, LISTLEN) + LIST.substring(0, shift % LISTLEN);
		
		String secretMessage = "";	//�Í���
		
		//�Í����쐬�B�����̕����������[�v����
		for(int i = 0; i < plainText.length(); i++){
			//������i�����̃C���f�b�N�X���擾����
			int plainTextIndex = LIST.indexOf(plainText.charAt(i));
			//�C���f�b�N�X��������Ȃ������i���p�p�����ȊO�́j�ꍇ�A?�ɒu��������
			if(plainTextIndex == -1){
				secretMessage += "?";
			}else{
				secretMessage += shiftList.charAt(plainTextIndex);
			}
		}
		
		//�Í�����Ԃ�
		return secretMessage;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** �V�[�U�[�Í� ***");
		System.out.print("���� (���p�p����)��");
		String inStr = sc.next();
		try{
			System.out.print("�V�t�g����");
			int inNum = Integer.parseInt(sc.next());
			System.out.print("�Í����F" + caesar(inStr, inNum));
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}
	}
}
