/*
 ������ ���� ���� �ο��ϱ�
 �տ��� �Է��� ���� �ڵ带 �������� ������ ���� ������ �ο��ϴ� ���α׷��� ����� ������.
 100~90���� A, 89~80���� B, 79~70�� C, 69~60���� D, �������� F�Դϴ�.
 int�� ���� score�� char�� ���� grade�� ����Ͽ� score�� ���� grade�� ����غ�����.
 * */

package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1 : medalColor = 'G';
					 break;
			case 2 : medalColor = 'S';
			 		 break;
			case 3 : medalColor = 'B';
			 		 break;
			default:
					 medalColor = 'A';
		}
		System.out.println(ranking + "�� �޴��� ������ " + medalColor + "�Դϴ�.");
	}
			
}
