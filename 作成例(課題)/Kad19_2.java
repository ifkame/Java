public class Kad19_2{
	
	//�V�F���\�[�g
	public static void shellSort(int[] data) {
		
		int h = data.length / 2;	//5��2��1��0
		
		//�Ԋu��0���傫���ԃ��[�v����
		while(h > 0){
			//�Ԋu�Ԗڂ̗v�f����X�^�[�g���A�f�[�^��̒����܂Ń��[�v����
			for(int i = h; i < data.length; i++){
				//j���r�����ʒu�Ƃ���
				int j = i;
				//��r����v�f�ԍ����Ԋu�ȏ�A���Ԋu�����ꂽ�����̗v�f���傫���ԃ��[�v����
				while(j >= h && data[j - h] > data[j]){
					//��������
					int tmp = data[j];
					data[j] = data[j - h];
					data[j - h] = tmp;
					//��r�v�f���X�V(5��0, 6��1...)
					j -= h;
				}
			}
			h /= 2;	//�Ԋu���X�V5��2��1��0
			printArray(data);	//�z��̒l��\��
		}
	}
	
	//�z��̒l�\��
	public static void printArray(int[] data) {
		
		for(int d : data){
			System.out.print(d + ", ");
		}
		System.out.println("");	//���s
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {2, 5, 8, 1, 4, 7, 3, 6, 9, 0};
		
		System.out.println("********* ���f�[�^ *********");
		printArray(numbers);
		System.out.println("***** �V�F���\�[�g�J�n *****");
		shellSort(numbers);
		System.out.println("***** �V�F���\�[�g���� *****");
	}
}