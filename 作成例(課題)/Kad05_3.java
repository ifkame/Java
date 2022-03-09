import java.util.Scanner;

public class Kad05_3{
	public static void main(String[] args){
		
		System.out.println("*** 3í‚ÌœZ ***");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("®”1„");
		int num1 = sc.nextInt();
		System.out.print("®”2„");
		int num2 = sc.nextInt();
		
		//Š„‚é”‚ª0‚Ìê‡
		if(num2 == 0){
			System.out.println("0‚ÅŠ„‚é‚±‚Æ‚Ío—ˆ‚Ü‚¹‚ñB");
		}else{
			System.out.print("[1->œZ 2->®”œZ 3->è—]Z]„");
			int operation = sc.nextInt();
			
			switch(operation){
			case 1:	//œZ
				System.out.println(num1 + " € " + num2 + "  " + (double)num1 / num2);
				break; 
			case 2:	//®”œZ
				System.out.println(num1 + " € " + num2 + "  " + num1 / num2);
				break; 
			case 3:	//è—]Z
				System.out.println(num1 + " € " + num2 + "  " + num1 / num2 + " ‚ ‚Ü‚è " + num1 % num2);
				break; 
			default:
				System.out.println("‰‰Z•û–@‚ª”ÍˆÍŠO‚Å‚·B");
				break; 
			}
		}
	}
}
