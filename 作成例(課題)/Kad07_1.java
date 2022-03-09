public class Kad07_1{
	public static void main(String[] args){
		
		System.out.println("1~100の奇数合計と偶数合計を求めます。");
		
		int oddSum = 0;		//奇数合計
		int evenSum = 0;	//偶数合計
		
		//iが1から100未満の間2ずつ増える
		for(int i = 1; i < 100; i += 2){
			oddSum += i;		//奇数加算
			evenSum += (i + 1);	//偶数加算
		}
		
		System.out.println("奇数合計：" + oddSum);
		System.out.println("偶数合計：" + evenSum);
	}
}
