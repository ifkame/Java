public class Kad09_3{
	public static void main(String[] args){
		
		final int LEN = 5;	//��ӂ̒���
		char[][] triangle = {{'��','��','��','��','��'},
							 {'��','��','��','��','��'},
							 {'��','��','��','��','��'},
							 {'��','��','��','��','��'},
							 {'��','��','��','��','��'}};
		int i, j;	//���[�v�J�E���^
		
		//�㕔
		for(i = 0; i < LEN; i++){
			//����
			for(j = LEN - 1; j >= 0; j--){
				System.out.print(triangle[i][j]);
			}
			//�E��
			for(j = 0; j < LEN; j++){
				System.out.print(triangle[i][j]);
			}
			System.out.println("");	//���s
		}
		
		//����
		for(i = LEN - 1; i >= 0; i--){
			//����
			for(j = LEN - 1; j >= 0; j--){
				System.out.print(triangle[i][j]);
			}
			//�E��
			for(j = 0; j < LEN; j++){
				System.out.print(triangle[i][j]);
			}
			System.out.println("");	//���s
		}
	}
}