import java.util.Scanner;

public class Kad17_2{

	//�񕪒T���i�o�C�i���T�[�`�j
	//@param data �����Ώۂ̔z��
	//@param key ����������
	public static int binarySearch(int[] data, int key){
		
		int left = 0;					//�ŏ��l�̂���ʒu
		int right = data.length - 1;	//�ő�l�̂���ʒu
		int center;						//�����l�̂���ʒu
		
		while(left <= right){				//�ŏ��l�̂���ʒu���ő�l�̂���ʒu���傫���ԃ��[�v
			center = (left + right) / 2;	//�����l�v�Z
			if(key > data[center]){				//�����l�������l���傫���Ƃ�
				left = center + 1;		//�ŏ��l�𒆉��l�{�P�̈ʒu�ɂ��炷
			}else if(key < data[center]){		//�����l�������l��菬�����Ƃ�
				right = center - 1;		//�ő�l�𒆉��l�[�P�̈ʒu�ɂ��炷
			}else{								//����ȊO�́i�����l�ƈ�v�����j�Ƃ�
				return center + 1;		//�����������l�{�P��ԋp
			}
		}
		return -1;
	}

	public static void main(String[] args){
		
		int[] numbers = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.println("�z��̃f�[�^�͈ȉ��̒ʂ�ł��B");
		
		for(int num : numbers){
			System.out.println(num);
		}
		
		System.out.print("�������l��");
		Scanner sc = new Scanner(System.in);
		
		try{
			int inNum = Integer.parseInt(sc.next());
			
			//�o�C�i���T�[�`���Ăяo���A�߂�l��index�Ɋi�[
			int index = binarySearch(numbers, inNum);
			
			if(index == -1){
				System.out.println(inNum + "�͌�����܂���ł����B");
			}else{
				System.out.println(inNum + "��" + index + "�ԖڂɌ�����܂����B");
			}
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}
	}
}
