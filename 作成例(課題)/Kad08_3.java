public class Kad08_3{
	public static void main(String[] args){
		
		char[] letters = {'E', 'C', 'C', '�R', '��', '�s', '��', '�[', '�^'};
		
		System.out.println("�z��̒l���t���ɕ��ёւ��Đ擪����\�����܂��B");
		//��������
		for(int i = 0; i < letters.length / 2; i++){
			char tmp = letters[i];	//�ꎞ�ޔ�
			letters[i] = letters[letters.length - (i + 1)];	
			letters[letters.length - (i + 1)] = tmp;
		}
		
		//�\������
		for(int i = 0; i < letters.length; i++){
			System.out.print(letters[i]);
		}
	}
}
