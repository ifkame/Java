public class Kad03_2{
	public static void main(String[] args){
		int priceA = 2500, priceB = 49800;	//A�̒P��, B�̒P��
		int numA = 15, numB = 2;			//A�̌�, B�̌�
		int subtotal;						//���v
		double tax, total;					//�����, ����ō��ݍ��v
		
		subtotal = priceA * numA + priceB * numB;
		tax = subtotal * 0.1;
		total = subtotal + tax;
		
		System.out.println("���iA " + priceA + " * " + numA + " = " + priceA * numA);
		System.out.println("���iB " + priceB + " * " + numB + " = " + priceB * numB);
		System.out.println("--------------------------");
		System.out.println("���v             " + subtotal);
		System.out.println("�����            " + (int)tax);
		System.out.println("���v             " + (int)total);
	}
}