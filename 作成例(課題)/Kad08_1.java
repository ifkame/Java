public class Kad08_1{
	public static void main(String[] args){
		
		int[] numbers = {10, 20, 30, 40, 50};
		int total = 0;	//���v�l
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println("numbers[" + i + "] = " + numbers[i]);
			total += numbers[i];	//���v�l���Z
		}
		
		System.out.println("���v�l�F" + total);
	}
}
