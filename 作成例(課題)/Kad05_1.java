import java.util.Scanner;

public class Kad05_1{
	public static void main(String[] args){
		
		int price;		//�艿
		int discount;	//������
		double sale;	//�̔����i
		
		System.out.println("*** �����v�Z ***");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�艿��");
		price = sc.nextInt();
		
		System.out.print("������[1->5% 2->10% 3->15%]��");
		discount = sc.nextInt();
		
		switch (discount) {
		case 1:
			sale = price * 0.95;	//5%����
			break;
		case 2:
			sale = price * 0.9;		//10%����
			break;
		case 3:
			sale = price * 0.85;	//15%����
			break;
		default:
			sale = price;
			break;
		}
		
		System.out.println("�̔����i��" + (int)sale + " �~�ł��B");
	}
}
