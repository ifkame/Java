public class Kad11_1{
	//実行時パラメータに（コマンドライン引数）に[ECC コンピュータ 専門学校]を設定する
	public static void main(String[] args){
		System.out.println("*** コマンドライン引数 ***");
		
		for(int i = 0; i < args.length; i++){
			System.out.println("args[" + i + "]の値：" + args[i]);
			System.out.println("args[" + i + "]の文字数：" + args[i].length());
			System.out.println("");	//改行
		}
	}
}
