import java.util.Scanner;

public class Kad08_2{
	public static void main(String[] args){
		System.out.println("10�i������2�i���ɕϊ����܂��B");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10�i������");
		int decimal = sc.nextInt();
		
		int[] bit = new int[256];
		int i = 0;
		//2�i���ɕϊ����z��֊i�[
		while(decimal > 0){
			bit[i] = decimal % 2;
			decimal /= 2;
			i++;
		}
		
		System.out.print("2�i���F");
		//�z��̖�������擪�܂ŏ��ɕ\��
		while(i > 0){
			i--;
			System.out.print(bit[i]);
		}
	}
}
