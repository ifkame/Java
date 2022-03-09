import java.util.Scanner;

public class Kad05_2{
	public static void main(String[] args){
		
		System.out.println("*** l‘¥‰‰Z ***");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("®”1„");
		int num1 = sc.nextInt();
		System.out.print("®”2„");
		int num2 = sc.nextInt();
		
		System.out.print("[1->‰ÁZ 2->Œ¸Z 3->æZ 4->œZ]„");
		int operation = sc.nextInt();
		
		switch(operation){
		case 1:	//‰ÁZ
			System.out.println(num1 + " { " + num2 + "  " + (num1 + num2));
			break; 
		case 2:	//Œ¸Z
			System.out.println(num1 + " | " + num2 + "  " + (num1 - num2));
			break; 
		case 3:	//æZ
			System.out.println(num1 + " ~ " + num2 + "  " + num1 * num2);
			break; 
		case 4: //œZ
			System.out.println(num1 + " € " + num2 + "  " + (double)num1 / num2);
			break; 
		default:
			System.out.println("‰‰Z•û–@‚ª”ÍˆÍŠO‚Å‚·B");
			break; 
		}
	}
}
