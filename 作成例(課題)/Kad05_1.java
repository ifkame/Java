import java.util.Scanner;

public class Kad05_1{
	public static void main(String[] args){
		
		int price;		//’è‰¿
		int discount;	//Š„ˆø—¦
		double sale;	//”Ì”„‰¿Ši
		
		System.out.println("*** Š„ˆøŒvZ ***");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("’è‰¿„");
		price = sc.nextInt();
		
		System.out.print("Š„ˆø—¦[1->5% 2->10% 3->15%]„");
		discount = sc.nextInt();
		
		switch (discount) {
		case 1:
			sale = price * 0.95;	//5%ˆø‚«
			break;
		case 2:
			sale = price * 0.9;		//10%ˆø‚«
			break;
		case 3:
			sale = price * 0.85;	//15%ˆø‚«
			break;
		default:
			sale = price;
			break;
		}
		
		System.out.println("”Ì”„‰¿Ši‚Í" + (int)sale + " ‰~‚Å‚·B");
	}
}
