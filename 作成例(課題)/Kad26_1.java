import java.util.Random;

public class Kad26_1{
	//�t�B�b�V���[-�C�F�[�c�̃V���b�t���y23_1���痬�p�z
	public static void shuffle(int[] data){
		int i, j, tmp;	//�J�E���^�E�ޔ�ϐ�
		for(i = data.length - 1; i > 0; i--){
			j = new Random().nextInt(i + 1);
			tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}
	
	/**
	 * �}�X�^�[�}�C���h�O����
	 * 0~9�̐��l���d�������Ɏw�肵���������쐬���A�\������B
	 */
	public static void main(String[] args){
		
		final int DIGIT = 10;	//����(1~10�܂�)
		int[] answer = new int[DIGIT]; 	//�𓚔z��
		int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		shuffle(number);	//���ƂȂ鐔�l�z����V���b�t������
		
		//�V���b�t�������z��̐擪���猅�����o���A�𓚔z��Ɋi�[����
		for(int i = 0; i < DIGIT; i++){
			answer[i] = number[i];
		}
		
		//�𓚔z��\��
		for(int ans : answer){
			System.out.print(ans);
		}
	}
}