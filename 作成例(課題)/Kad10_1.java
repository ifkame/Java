public class Kad10_1{
	public static void main(String[] args){
		
		char[] letters = {'�R', '��', '�s', '��', '�[', '�^'};
		String concat = "";	//�A��������
		
		System.out.println("*** �g��for���Ŕz��̒l��\�� ***");
		for(char letter : letters){
			System.out.println(letter);
			concat += letter;	//�����A��
		}
		
		System.out.println("*** �A���������ʂ�\�� ***");
		System.out.println(concat);
	}
}