public class Kad10_2{
	public static void main(String[] args){
		
		//�L�[�{�[�h
		char[][] keyboard ={{'��', '��', '��'},
							{'��', '��', '��'},
							{'��', '��', '��'},
							{'�G', '��', '�I'}};
		
		//�ŏ㕔�r��
		System.out.println("----------------");
		//�s���[�v
		for(char[] row : keyboard){
			System.out.print("| ");
			//�񃋁[�v
			for(char col : row){
				System.out.print(col + " | ");
			}
			System.out.println("\n----------------");	//���s & �r��
		}
	}
}