public class Kad18_1{
	
	//�I���\�[�g
	//@param data �����Ώ۔z��
	public static void selectSort(int[] data) {
		
		// �f�[�^���r����񐔕����[�v(length-1��)
		for(int i = 0; i < data.length - 1; i++){
			int pos = i;	//�����l�Ƃ���i�Ԗڂ��ŏ��l�̗v�f�Ƃ���
			// �ŏ��̒l�Ɣ�r����񐔕����[�v(length-2��)
			for(int j = i + 1; j < data.length; j++){
				/*	�ŏ��l(��)�ƒl���r���āA
					�ŏ��l�̕����傫���Ƃ�	*/
				if(data[j] < data[pos]){
					// �ŏ��l�̂���v�f�ԍ����i�[
					pos = j;
				}
			}
			//i�Ԗڂƍŏ��l������
			int tmp = data[i];
			data[i] = data[pos];
			data[pos] = tmp;
			
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
		System.out.println("****** �I���\�[�g�J�n ******");
		selectSort(numbers);
		System.out.println("****** �I���\�[�g���� ******");
	}
}
