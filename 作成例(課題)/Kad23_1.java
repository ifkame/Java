import java.util.Scanner;
import java.util.Random;

public class Kad23_1{
	//�t�B�b�V���[-�C�F�[�c�̃V���b�t��
	public static void shuffle(int[] data){
		Random ra = new Random();
		for(int i = data.length - 1; i > 0; i--){
			int j = ra.nextInt(i + 1);
			int tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}
	
	/**
	 * ���b�N�i���o�[�T�[�`
	 * 1~MAXNUMBER�̐��l���V���b�t�����ĕ\�����܂��B�������A1�������l�������Ă��܂��B
	 * ���̌����Ă��鐔�l�𓖂Ă�Q�[���ł��B
	 */
	public static void main(String[] args){
	
		final int MAXNUMBER = 9;	//�ő吔
		int lackNumber = 0;			//���b�N�i���o�[�i�[�ϐ�
		int[] numbers = new int[MAXNUMBER];	//���l�i�[�z��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���b�N�i���o�[�T�[�`�I\n");
		while(true){
			//�z��ɐ��l�i�[
			for(int i = 0; i < numbers.length; i++){
				numbers[i] = i + 1;
			}
			
			//numbers�z��V���b�t��
			shuffle(numbers);
			
			//�擪�v�f�����b�N�i���o�[�Ƃ���
			lackNumber = numbers[0];
			
			//���l�\��
			for(int i = 1; i < numbers.length; i++){
				System.out.print(numbers[i] + " ");
			}
			
			System.out.print("\n�����Ă��鐔�l�́H(1~" + MAXNUMBER + ")��");
			try{
				//���͒l�����b�N�i���o�[�Ɠ������ꍇ
				if(Integer.parseInt(sc.next()) == lackNumber){
					System.out.println("�����I");
					break;	//���[�v�𔲂��ďI��
				}else{
					System.out.println("�s�����I");
				}
			}catch(NumberFormatException nfe){
				System.out.println("���͒l���s���ł��B");
			}
			System.out.println("");	//���s
		}
	}
}