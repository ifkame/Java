public class Kad03_2{
	public static void main(String[] args){
		int priceA = 2500, priceB = 49800;	//AΜPΏ, BΜPΏ
		int numA = 15, numB = 2;			//AΜΒ, BΜΒ
		int subtotal;						//¬v
		double tax, total;					//ΑοΕ, ΑοΕέv
		
		subtotal = priceA * numA + priceB * numB;
		tax = subtotal * 0.1;
		total = subtotal + tax;
		
		System.out.println("€iA " + priceA + " * " + numA + " = " + priceA * numA);
		System.out.println("€iB " + priceB + " * " + numB + " = " + priceB * numB);
		System.out.println("--------------------------");
		System.out.println("¬v             " + subtotal);
		System.out.println("ΑοΕ            " + (int)tax);
		System.out.println("v             " + (int)total);
	}
}