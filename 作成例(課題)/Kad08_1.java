public class Kad08_1{
	public static void main(String[] args){
		
		int[] numbers = {10, 20, 30, 40, 50};
		int total = 0;	//合計値
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println("numbers[" + i + "] = " + numbers[i]);
			total += numbers[i];	//合計値加算
		}
		
		System.out.println("合計値：" + total);
	}
}
