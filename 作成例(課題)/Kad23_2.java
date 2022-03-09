import java.util.Scanner;
import java.util.Random;

public class Kad23_2{
	//�t�B�b�V���[-�C�F�[�c�̃V���b�t��
	public static void shuffle(int[] data){
		int i, j, tmp;	//�J�E���^�E�ޔ�ϐ�
		Random ra = new Random();
		for(i = data.length - 1; i > 0; i--){
			j = ra.nextInt(i + 1);
			tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}
	
	/**
	 * �_�u���i���o�[�T�[�`
	 * 1~MAXNUMBER�̐��l���V���b�t�����ĕ\�����܂��B�������A1�������l���_�u���Ă��܂��B
	 * ���̃_�u���Ă��鐔�l�𓖂Ă�Q�[���ł��B
	 */
	public static void main(String[] args){
	
		final int MAXNUMBER = 9;	//�ő吔
		int doubleNumber = 0;		//�_�u���i���o�[�i�[�ϐ�
		int[] numbers = new int[MAXNUMBER + 1];	//���l�i�[�z��y23_2��+1�ɕύX�z
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�_�u���i���o�[�T�[�`�I\n");
		while(true){
			//�z��ɐ��l�i�[�y23_2��length - 1�ɕύX�z
			int i;
			for(i = 0; i < numbers.length - 1; i++){
				numbers[i] = i + 1;
			}
			
			//�_�u���i���o�[����
			Random ra = new Random();
			doubleNumber = ra.nextInt(MAXNUMBER) + 1;
			//�����Ƀ_�u���i���o�[�i�[
			numbers[i] = doubleNumber; 
			
			//numbers�z��V���b�t��
			shuffle(numbers);
			
			//���l�\���y23_2�ŃJ�E���^��0����ɕύX�z
			for(i = 0; i < numbers.length; i++){
				System.out.print(numbers[i] + " ");
			}
			System.out.print("\n�d�����Ă��鐔�l�́H(1~" + MAXNUMBER + ")��");
			try{
				//���͒l���_�u���i���o�[�Ɠ������ꍇ
				if(Integer.parseInt(sc.next()) == doubleNumber){
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