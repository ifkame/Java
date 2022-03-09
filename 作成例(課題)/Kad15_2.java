import java.util.Scanner;
import java.util.Arrays;

public class Kad15_2{
	
	// �G���g�X�e�l�X��⿂Ɋ�Â��A�f�������߂�
	public static boolean[] eratosthenes(int n){
	
		// �f���t���O�錾(true:�f��, false:��f��)
		boolean[] flag = new boolean[n + 1];
		
		// �f���t���O�̏�����(2����n�܂ł�f�����Ƃ���true��������)
		Arrays.fill(flag, 2, n, true);
		
		// �f���̔{����f����₩�珜�O(��f����false�ɂ���)
		for(int i = 2; i <= Math.sqrt(n); i++){
			for(int j = i * 2; j <= n; j += i){
				flag[j] = false;
			}
		}
		return flag;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����܂ł̑f�������߂܂����H��");
		
		try{
			int inNum = Integer.parseInt(sc.next());
			
			// �G���g�X�e�l�X���\�b�h���Ăт����f�������߁A
			// �߂�l��boolean�^�z��(true:�f��, false:��f��)��������B
			boolean[] primeNumFlag = eratosthenes(inNum);
			
			// ���߂��f����\��
			for(int i = 2; i <= inNum; i++){
				if(primeNumFlag[i]){
					System.out.print(i + " ");
				}
			}
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}
	}
}