public class Kad09_2{
	public static void main(String[] args){
		
		int[][] table = {{1, 2, 3, 4},
						 {5, 6, 7, 8},
						 {9, 10, 11, 12}};
						 
		int[] rowSum = new int[3];	//�s���v
		int[] colSum = new int[4];	//�񍇌v
		int total = 0;				//�����v
		
		System.out.println("*** 3�s4��̃N���X�W�v�\ ***");
		
		//�s���[�v
		for(int i = 0; i < rowSum.length; i++){
			//�񃋁[�v
			for(int j = 0; j < colSum.length; j++){
				rowSum[i] += table[i][j];	//�s���v���Z
				colSum[j] += table[i][j];	//�񍇌v���Z
				total += table[i][j];		//�����v���Z
				System.out.print(table[i][j] + "\t");	//�^�u��؂�Œl�\��
			}
			System.out.println(" | " + rowSum[i]);	//�s���v�\��
		}
		System.out.println("-------------------------------------");
		
		//�񍇌v�\��
		for(int i = 0; i < colSum.length; i++) {
			System.out.print(colSum[i] + "\t");
		}
		//�����v�\��
		System.out.println(" | " + total);
	}
		
}
