public class Kad03_2{
	public static void main(String[] args){
		int priceA = 2500, priceB = 49800;	//Aの単価, Bの単価
		int numA = 15, numB = 2;			//Aの個数, Bの個数
		int subtotal;						//小計
		double tax, total;					//消費税, 消費税込み合計
		
		subtotal = priceA * numA + priceB * numB;
		tax = subtotal * 0.1;
		total = subtotal + tax;
		
		System.out.println("商品A " + priceA + " * " + numA + " = " + priceA * numA);
		System.out.println("商品B " + priceB + " * " + numB + " = " + priceB * numB);
		System.out.println("--------------------------");
		System.out.println("小計             " + subtotal);
		System.out.println("消費税            " + (int)tax);
		System.out.println("合計             " + (int)total);
	}
}