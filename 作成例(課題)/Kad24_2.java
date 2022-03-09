import java.util.Scanner;
import java.util.Random;

public class Kad24_2{
	
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
	 * �y24_2�ŕ���ǉ��z
	 * �r���S�J�[�h�\�����\�b�h
	 */
	public static void showCard(int[][] card){
		System.out.println("-------------");
		for(int i = 0; i < card.length; i++){
			System.out.print("| ");
			for(int j = 0; j < card[i].length; j++){
				if(card[i][j] == 0){				//�y24_2�ǉ��z
					System.out.print("X" + " | ");	// 0�̎���X�ƕ\��
				}else{
					System.out.print(card[i][j] + " | ");
				}
			}
			System.out.println("\n-------------");
		}
	}
	
	/**
	 * �y24_2�Œǉ��z
	 * �����������������ǂ����m�F���郁�\�b�h
	 */
	public static void checkHit(int[][] card, int ball){
		for(int i = 0; i < card.length; i++){
			for(int j = 0; j < card[i].length; j++){
				if(card[i][j] == ball){
					card[i][j] = 0;
				}
			}
		}
	}
	
	/**
	 * �y24_2�Œǉ��z
	 * �r���S���Ă��邩�`�F�b�N���郁�\�b�h
	 * 1��ł��r���S���Ă����true�A���ĂȂ����false��Ԃ��B
	 */
	public static boolean checkBingo(int[][] card){
		final int LEN = card.length;	//���(���E�c�E�΂�)�̒���
		int i, j, count = 0;
		
		//���`�F�b�N
		for(i = 0; i < LEN; i++){
			for(j = 0; j < LEN; j++){
				if(card[i][j] == 0){
					count++;
				}
			}
			if(count == LEN){
				return true;	//�r���S
			}else{
				count = 0;		//�J�E���^���Z�b�g
			}
		}
		
		//�c�`�F�b�N
		for(i = 0; i < LEN; i++){
			for(j = 0; j < LEN; j++){
				if(card[j][i] == 0){
					count++;
				}
			}
			if(count == LEN){
				return true;	//�r���S
			}else{
				count = 0;		//�J�E���^���Z�b�g
			}
		}
		
		//�΂߁i�_�j�`�F�b�N
		for(i = 0; i < LEN; i++){
			if(card[i][i] == 0){
				count++;
			}
		}
		if(count == LEN){
			return true;	//�r���S
		}else{
			count = 0;		//�J�E���^���Z�b�g
		}
		
		//�΂߁i�^�j�`�F�b�N
		for(i = 0; i < LEN; i++){
			if(card[i][(LEN - 1) - i] == 0){
				count++;
			}
		}
		if(count == LEN){
			return true;	//�r���S
		}
		return false;
	}
	
	/**
	 * BINGO�Q�[�����s��
	 */
	public static void main(String[] args){
		int[][] bingoCard = createCard();
		System.out.println("BINGO�Q�[���I\n���Ȃ��̃J�[�h�͂�����ł��B");
		showCard(bingoCard);	//�J�[�h�\��
		
		//�yKad24_2�ł������牺��ǉ��z
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("\n��׶�׶��...���Ԃ̋ʂ��o�܂������H��");
			try{
				int bingoBall = Integer.parseInt(sc.next());
				checkHit(bingoCard, bingoBall);	//���������������ǂ������ׂ�
				showCard(bingoCard);			//�J�[�h�\��
				
				//�r���S����
				if(checkBingo(bingoCard)){
					System.out.println("BINGO!!");
					break;
				}
			}catch(NumberFormatException nfe){
				System.out.println("���͒l���s���ł��B");
			}
		}
	}
}