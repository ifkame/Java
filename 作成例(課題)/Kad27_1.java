import java.util.Scanner;

public class Kad27_1{
	/**
	 * �t�B�{�i�b�`����
	 */
	public static int fibonacci(int n){
		
		//�����Ŏ󂯎�������l��0�̎���0��1�̎���1��Ԃ�
		if(n == 0){	
			return 0;
		}else if(n == 1){	
			return 1;
		}
		//1�O�̐��l��2�O�̐��l�������ɂ��āA���g���ċA�I�ɌĂяo�������ʂ̘a��Ԃ��B
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		final int MAX = 20;	//�t�B�{�i�b�`����̍ő吔
		
		System.out.println("*** �t�B�{�i�b�`���� ***");
		System.out.print("�����������܂����H(1~" + MAX + ")�F");
		try{
			int inNum = Integer.parseInt(sc.next());
			if(inNum < 1 || inNum > MAX){
				System.out.println("���͒l���͈͊O�ł��B");
			}else{
				for(int i = 0; i < inNum; i++){
					System.out.print(fibonacci(i) + ",");	//�t�B�{�i�b�`����\��
				}
			}
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}
	}
}
