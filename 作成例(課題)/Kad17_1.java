import java.util.Scanner;

public class Kad17_1{

	//���`�T���i���j�A�T�[�`�j
	//@param data �����Ώۂ̔z��
	//@param key ����������
	public static int linearSearch(String[] data, String key){
		//�����Ώۂ̔z��̐��������[�v
		for(int i = 0; i < data.length; i++){
			//�����Ώۂ̕�����ƌ��������񂪈�v�����Ƃ�
			//��v�����ԍ���ԋp
			if(key.equals(data[i])){
				return i + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		
		String[] fruitsArray = {"�����S", "������", "������", "�o�i�i", "�C�`�S" };
		
		System.out.println("�z��̃f�[�^�͈ȉ��̒ʂ�ł��B");
		
		for(String fruits : fruitsArray){
			System.out.println(fruits);
		}
		
		System.out.print("����������");
		Scanner sc = new Scanner(System.in);
		String inStr = sc.next();	//������������͂��i�[
		
		//���j�A�T�[�`���Ăяo���A�߂�l��index�Ɋi�[
		int result = linearSearch(fruitsArray, inStr);
		
		if(result == -1){
			System.out.println(inStr + "�͌�����܂���ł����B");
		}else{
			System.out.println(inStr + "��" + result + "�ԖڂɌ�����܂����B");
		}
	}
}
