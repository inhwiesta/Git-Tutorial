/*
 ������ ���� ���� �ο��ϱ�
 �տ��� �Է��� ���� �ڵ带 �������� ������ ���� ������ �ο��ϴ� ���α׷��� ����� ������.
 100~90���� A, 89~80���� B, 79~70�� C, 69~60���� D, �������� F�Դϴ�.
 int�� ���� score�� char�� ���� grade�� ����Ͽ� score�� ���� grade�� ����غ�����.
 * */

package ifexample;

public class Ifexample3 {

	public static void main(String[] args) {
		int score = 79;
		char grade;
		
		if (score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("������ " + score + "���Դϴ�. " + "�׸��� ������ " + grade + "�Դϴ�.");
	}
			
}
