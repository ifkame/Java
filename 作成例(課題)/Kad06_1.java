import java.util.Scanner;

public class Kad06_1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڕW���z��");
		int target = sc.nextInt();
		int sav = 1;	//�����z
		int sum = 0;	//���v���z
		int day = 0;	//����
		
		while(sum < target){
			sum += sav;
			sav *= 2;
			day++;
		}
		
		System.out.println(day + "����" + sum + "�~�����ł��܂��B");
	}
}