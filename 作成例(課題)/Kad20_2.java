public class Kad20_2{
	
	// �N�C�b�N�\�[�g(����)
	public static void quickSort(int[] data, int left, int right) {
		
		//�\�[�g�I��
		if(left >= right){
			return;
		}
		
		//��l
		int pivot = data[(left + right) / 2];
		//�T���p�v�f
		int searchLeft = left, searchRight = right;
		
		//�T���p�v�f���d�Ȃ�܂Ń��[�v����
		while(searchLeft < searchRight){
			//��l�ȏ�̒l��������܂ō����珇�ɒT������
			while(data[searchLeft] < pivot){ 
				searchLeft++;
			}
			//��l�ȉ��̒l��������܂ŉE���珇�ɒT������
			while(data[searchRight] > pivot){
				searchRight--;
			}
			//�T���v�f�����������ꍇ�͌��������Ƀ��[�v�𔲂���
			if(searchLeft > searchRight){
				break;
			}
			
			//�T��������l���傫���l�Ə������l�����ւ���
			int tmp = data[searchLeft];
			data[searchLeft] = data[searchRight];
			data[searchRight] = tmp;
			//�T���J�n�ʒu���X�V����
			searchLeft++;
			searchRight--;
		}
		printArray(data);	//�z��̒l��\��
		//��l��荶�����ċA�Ăяo���ŃN�C�b�N�\�[�g����
		quickSort(data, left, searchRight);
		//��l���E�����ċA�Ăяo���ŃN�C�b�N�\�[�g����
		quickSort(data, searchLeft, right);
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
		System.out.println("**** �N�C�b�N�\�[�g�J�n ****");
		quickSort(numbers, 0, numbers.length - 1);
		System.out.println("**** �N�C�b�N�\�[�g���� ****");
	}
}
