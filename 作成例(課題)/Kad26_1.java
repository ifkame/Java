import java.util.Random;

public class Kad26_1{
	//フィッシャー-イェーツのシャッフル【23_1から流用】
	public static void shuffle(int[] data){
		int i, j, tmp;	//カウンタ・退避変数
		for(i = data.length - 1; i > 0; i--){
			j = new Random().nextInt(i + 1);
			tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}
	
	/**
	 * マスターマインド前準備
	 * 0~9の数値を重複せずに指定した桁数分作成し、表示する。
	 */
	public static void main(String[] args){
		
		final int DIGIT = 10;	//桁数(1~10まで)
		int[] answer = new int[DIGIT]; 	//解答配列
		int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		shuffle(number);	//元となる数値配列をシャッフルする
		
		//シャッフルした配列の先頭から桁数個取り出し、解答配列に格納する
		for(int i = 0; i < DIGIT; i++){
			answer[i] = number[i];
		}
		
		//解答配列表示
		for(int ans : answer){
			System.out.print(ans);
		}
	}
}