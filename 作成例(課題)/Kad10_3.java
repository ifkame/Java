public class Kad10_3{
	public static void main(String[] args){
		
		int[][] table = {{50, 70, 30},
						 {80, 60, 10},
						 {40, 20, 90}};
		
		//�擪�v�f���ŏ��l�ƍő�l�̏����l�ɂ���
		int min = table[0][0];	//�ŏ��l
		int max = min;			//�ő�l
		int total = 0;			//���v�l
		
		System.out.println("�񎟌��z�񂩂�ŏ��l�E�ő�l�E���v�l�����߂܂��B\n");
		
		//�s���[�v
		for(int[] row : table){
			//�񃋁[�v
			for(int col : row){
				System.out.print(col + ",");	//�J���}��؂�Œl�\��
				
				//�\�������l�����݂̍ŏ��l��菬�����ꍇ
				if(col < min){
					min = col;	//�ŏ��l�X�V
				}
				
				//�\�������l�����݂̍ő�l���傫���ꍇ
				if(col > max){
					max = col;	//�ő�l�X�V
				}
				
				total += col;	//���v�l���Z
			}
			System.out.println("");	//���s
		}
		System.out.println("\n�ŏ��l��" + min + "�ŁA" + "�ő�l��" + max + "�ŁA" + "���v�l��" + total + "�ł��B");
	}
}
