import java.util.Scanner;

public class Kad06_1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("–Ú•W‹àŠz„");
		int target = sc.nextInt();
		int sav = 1;	//’™‹àŠz
		int sum = 0;	//‡Œv‹àŠz
		int day = 0;	//“ú”
		
		while(sum < target){
			sum += sav;
			sav *= 2;
			day++;
		}
		
		System.out.println(day + "“ú‚Å" + sum + "‰~’™‹à‚Å‚«‚Ü‚·B");
	}
}