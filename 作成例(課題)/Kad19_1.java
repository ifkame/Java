public class Kad19_1{
	
	//�}���\�[�g
	public static void insertSort(int[] data) {
		
		//0�Ԗڂ��\�[�g�ς݂Ƃ��A1�Ԗڂ��疖���܂Ń��[�v
		for(int i = 1; i < data.length; i++){
			int tmp = data[i];	//�}������f�[�^��ޔ�
			if(data[i - 1] > tmp){	//�ޔ��f�[�^���A�\�[�g�ς݂̖����̒l���傫���ꍇ
				int j = i;
				do{
					data[j] = data[j - 1];	//1�E�̗v�f�ɒl���ڂ�
					j--;
				}while(j > 0 && data[j - 1] > tmp);	
				data[j] = tmp;	//�ޔ��f�[�^��K�؂Ȉʒu�ɑ}������B
			}
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
		System.out.println("****** �}���\�[�g�J�n ******");
		insertSort(numbers);
		System.out.println("****** �}���\�[�g���� ******");
	}
}