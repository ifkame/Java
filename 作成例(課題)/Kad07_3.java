public class Kad07_3{
	public static void main(String[] args){
		
		//1~9�̒i���\��
		System.out.print("  |");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d ", i);
		}
		
		//�r��
		System.out.println("\n------------------------------");
		
		//�s���[�v
		for(int i = 1; i <= 9; i++){
			System.out.printf("%2d|", i);	//1~9�̒i�c�\��
			//�񃋁[�v
			for(int j = 1; j <= 9; j++){
				System.out.printf("%2d ", i * j);
			}
			System.out.println("");	//���s
		}
	}
}
