/************************
 * 課題名：Kad02_Ex01
 * 作成者：角野　優美子
 * 日付　：2021/04/15
 ************************/
public class Kad02_Ex01{
	public static void main(String[] args){
		System.out.println("|--------------------------------------|");
		System.out.println("|          ECCストア                   |");
		System.out.println("|          中崎町店                    |");
		System.out.println("|2021年04月15日（木） 14:27            |");
		System.out.println("|      ---------------------------     |");
		System.out.println("|      |       領 収 書          |     |");
		System.out.println("|      ---------------------------     |");
		System.out.println("|アンパン    2 × 80 \\" + 2 * 80 + "              |");
		System.out.println("|牛乳        2 ×168 \\" + 2 * 168 + "              |" );
		System.out.println("|--------------------------------------|");
		System.out.println("|小計（税抜き）      \\" + (2 * 80 + 2 * 168)  + "              |");
		System.out.println("|  消費税等(8%)      \\" + (2 * 80 + 2 * 168) * 0.08  + "            |");
		System.out.println("|合計                \\" + (2 * 80 + 2 * 168) * 1.08  + "|");
		System.out.println("|--------------------------------------|");
	}
}
