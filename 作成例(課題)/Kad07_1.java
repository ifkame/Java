public class Kad07_1{
	public static void main(String[] args){
		
		System.out.println("1~100�̊���v�Ƌ������v�����߂܂��B");
		
		int oddSum = 0;		//����v
		int evenSum = 0;	//�������v
		
		//i��1����100�����̊�2��������
		for(int i = 1; i < 100; i += 2){
			oddSum += i;		//����Z
			evenSum += (i + 1);	//�������Z
		}
		
		System.out.println("����v�F" + oddSum);
		System.out.println("�������v�F" + evenSum);
	}
}
