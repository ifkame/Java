import java.util.Scanner;

public class Kad15_1{
	
	//���[�N���b�h�̌ݏ��@
	public static int euclid(int x, int y){
		int rem;	//�]��
		
		//y��0�łȂ��ԃ��[�v
		while(y != 0){
			rem = x % y;	//x��y�Ŋ������]���rem�ɑ��
			x = y;			//x��y�ōX�V
			y = rem;		//y��]��ōX�V
		}
		return x;	//x�i�ő���񐔁j��Ԃ�
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("����1��");
			int num1 = Integer.parseInt(sc.next());
			System.out.print("����2��");
			int num2 = Integer.parseInt(sc.next());
			System.out.println("�ő���񐔁F" + euclid(num1, num2));
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}
	}
}