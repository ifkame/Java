import java.util.Scanner;
import java.util.Random;

public class Kad14_2{
	
	//�����ă`�F�b�N
	public static int check(int n, int ans) {
		if(n > ans){
			//���͒l���������傫��
			return 1;
		}else if(n < ans){
			//���͒l��������菬����
			return 2;
		}else{
			//���͒l�������ƈ�v
			return 3;
		}
	}
	
	public static void main(String[] args){
		
		final int MAX = 100;	//�����ő�l
		Random rnd = new Random();
		int ransu = rnd.nextInt(MAX) + 1;	//1~MAX�܂ł̗�������
		System.out.println("*** �����ăQ�[�� ***");
		
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
				System.out.print("���Ԃł��傤�H(1~" + MAX + ")��");
				int inNum = Integer.parseInt(sc.next());
				int result = check(inNum, ransu);
				if(result == 1){
					System.out.println("�����Ə�������I");
				}else if(result == 2){
					System.out.println("�����Ƒ傫����I");
				}else if(result == 3){
					System.out.println("�����I");
					break;
				}
			}catch(NumberFormatException nfe){
				System.out.println("���͒l���s���ł��B");
			}
		}
	}
}
