import java.util.Random;

public class Kad24_1{
	
	/**
	 * �r���S�J�[�h�쐬���\�b�h
	 */
	public static int[][] createCard(){
		int card[][] = new int[3][3];	//���l�i�[�z��
		int ransu = 0;					//�����i�[�ϐ�
		boolean[] ransuFlag = new boolean[9];	//�����t���O(true:�g�p�� false:���g�p)
		Random ra = new Random();
		
		//1~9�܂ł̗������d���������ɓ񎟌��z��Ɋi�[����
		for(int i = 0; i < card.length; i++){
			for(int j = 0; j < card[i].length; j++){
				do{
					ransu = ra.nextInt(9);
				}while(ransuFlag[ransu]);
				ransuFlag[ransu] = true;
				card[i][j] = ransu + 1;
			}
		}
		return card;
	}
	
	/**
	 * �r���S�J�[�h�\�����\�b�h
	 */
	public static void showCard(int[][] card){
		System.out.println("-------------");
		for(int i = 0; i < card.length; i++){
			System.out.print("| ");
			for(int j = 0; j < card[i].length; j++){
				System.out.print(card[i][j] + " | ");
			}
			System.out.println("\n-------------");
		}
	}
	
	/**
	 * �r���S�Q�[�����s���ׂ̃r���S�J�[�h���쐬����
	 */
	public static void main(String[] args){
		int[][] bingoCard = createCard();	//�r���S�J�[�h���쐬���i�[
		System.out.println("BINGO�Q�[���I\n���Ȃ��̃J�[�h�͂�����ł��B");
		showCard(bingoCard);	//�J�[�h�\��
	}
}