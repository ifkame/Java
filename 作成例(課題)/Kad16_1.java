import java.util.Scanner;

public class Kad16_1{
	
	//���������O�X�@
	public static String runLength(String data){
		
		int i = 0; 				// ������C���f�b�N�X
		int count = 1;			// �������J�E���^
		String outStr = "";		// �o�͕���
		String subStr;			// ��������
		
		//�擪�����𔲂��o��
		subStr = data.substring(i, i + 1);
		
		//���͕�����(inStr)�̕��������J��Ԃ��i�擪�������j
		for(i = 0; i < data.length() - 1; i++){
			
			//���̕����𔲂��o���A��r����
			if(subStr.equals(data.substring(i + 1, i + 2))){
				//���������������ꍇ��count��+1����
				count++;
			}else{
				//�Ⴄ�����ɑ���������J��Ԃ������Ɖ񐔂��o�͕����ϐ��ɘA������
				outStr += " $" + subStr + ":" + count;
				//���̕����𔲂��o���A�����������X�V����
				subStr = data.substring(i + 1, i + 2);
				//�J�E���^������������
				count = 1;
			}
		}
		
		//�Ō�̕����Ɖ񐔂��o�͕����i�[�ϐ��ɘA������
		outStr += " $" + subStr + ":" + count;
		//�o�͕�����Ԃ�
		return outStr;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������");
		String inStr = sc.next();	// ���͕����i�[�ϐ�
		
		System.out.println(runLength(inStr));	//���������O�X���\�b�h�Ăяo��
	}
}