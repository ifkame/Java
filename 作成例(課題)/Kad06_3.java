import java.util.Scanner;

public class Kad06_3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;	//���v�l
		int count = 0;	//���͉�
		
		while(true){
			System.out.print("����" + (count + 1) + "��");
			int num = sc.nextInt();	
			//0�����͂��ꂽ�ꍇ
			if(num == 0){
				break;		//���[�v�I��
			}
			total += num;	//���v�l���Z
			count++;		//���͉񐔉��Z
		}
		//���͉񐔂�0����Ȃ��ꍇ
		if(count != 0){
			System.out.println("���v�l��" + total + "�ŁA���ϒl��" + (total / count) + "�ł��B");
		}
	}
}
