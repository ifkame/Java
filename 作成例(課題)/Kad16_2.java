import java.util.Scanner;

public class Kad16_2{
	
	//�͂܂����@(�T������:0�ȏ�, �T�����s:-1)
	public static int bruteForce(String data, String search){
		
		int dc = 0;	//data(�T���Ώە�����)���Ȃ���J�[�\��
		int sc = 0;	//search(����������)���Ȃ���J�[�\��
		
		//���J�[�\�������ꂼ��̕�����̖����ɒH����܂Ń��[�v
		while(dc != data.length() && sc != search.length()){
			//�T���Ώە�����ƌ��������񂩂甲���o����1��������v���Ă���ꍇ
			if(data.charAt(dc) == search.charAt(sc)){
				//���̕����փJ�[�\���ړ�
				dc++;	
				sc++;
			}else{	//�s��v�̏ꍇ
				dc = dc - sc + 1;	//�T���ςݕ�����̎��̕����փJ�[�\���ړ�
				sc = 0;				//����������̐擪�̕����փJ�[�\���ړ�
			}
		}
		
		//����������J�[�\���ʒu�������������Ɠ����i���S��v�����j�ꍇ
		if(sc == search.length()){
			return dc - sc + 1;	//�T������
		}
		return -1;	//�T�����s
	}
	
	public static void main(String[] args){
		
		final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println("�f�[�^�F" + ALPHABET);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����������");
		String inStr = sc.next();
		
		//�͂܂����T�����s���A���ʂ��i�[����
		int result = bruteForce(ALPHABET, inStr);
		if(result == -1){
			System.out.println(inStr + "�͌�����܂���ł����B");
		}else{
			System.out.println(inStr + "��" + result + "�����ڂɌ�����܂����B");
		}
	}
}