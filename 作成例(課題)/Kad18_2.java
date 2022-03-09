public class Kad18_2{
	
	//�o�u���\�[�g
	//@param data �����Ώ۔z��
	public static void bubbleSort(int[] data){
		
		// �f�[�^���r����񐔃��[�v
		for(int i = 0; i < data.length - 1; i++){
			// �O���珇�Ԃɔ�r����񐔃��[�v
			for(int j = 1; j < data.length - i; j++){
				/*	1�O�̒l�Ɣ�r���āA
					1�O�̒l���傫���Ƃ�	*/
				if(data[j - 1] > data[j]){
					// ����ւ��̏���
					int tmp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = tmp;
				}
			}
			printArray(data);	//�z��̒l��\��
		}
	}
	
	//�z��̒l�\��
	//@param data �\���Ώ۔z��
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
		System.out.println("***** �o�u���\�[�g�J�n *****");
		bubbleSort(numbers);
		System.out.println("***** �o�u���\�[�g���� *****");
	}
}
