public class Kad12_2{
	
	enum BloodType{A, B, O, AB}
	
	public static void main(String[] args){
		
		System.out.println("*** ŒŒ‰tŒ^•Ê‚Ì“Á’¥ ***");
		
		for(BloodType bt : BloodType.values()){
			System.out.print(bt + "Œ^F");
			switch(bt){
			case A:
				System.out.println("™{’ –Ê");
				break;
			case B:
				System.out.println("ŒÂ«“I");
				break;
			case O:
				System.out.println("‘å‚ç‚©");
				break;
			case AB:
				System.out.println("“VË”§");
				break;
			}
		}
	}
}
