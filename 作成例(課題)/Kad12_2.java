public class Kad12_2{
	
	enum BloodType{A, B, O, AB}
	
	public static void main(String[] args){
		
		System.out.println("*** ���t�^�ʂ̓��� ***");
		
		for(BloodType bt : BloodType.values()){
			System.out.print(bt + "�^�F");
			switch(bt){
			case A:
				System.out.println("�{����");
				break;
			case B:
				System.out.println("���I");
				break;
			case O:
				System.out.println("��炩");
				break;
			case AB:
				System.out.println("�V�˔�");
				break;
			}
		}
	}
}
