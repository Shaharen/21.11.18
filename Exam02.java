import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// ����ó������� �� ������ ���䰳���� int�� Ÿ���� ���� 5���� �����ϰ� �Է¹ޱ�
		// �Ѱ����̶� ������ 8�� �̸��ϰ�� "���հ��Դϴ�!" ���
		// �� ������ 60�� �̻��̸�  "�հ��Դϴ�!"�� ��� ,����� �ִ� 20������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int a = sc.nextInt();
		System.out.print("���ڰ��� ���� : ");
		int b = sc.nextInt();
		System.out.print("OS : ");
		int c = sc.nextInt();
		System.out.print("��������� : ");
		int d = sc.nextInt();
		System.out.print("����Ʈ������� : ");
		int e = sc.nextInt();
		int sum = a + b + c + d + e;
		
		boolean isCheck1 = a >= 8 && b >= 8 && c >= 8 && d >= 8 && e >= 8; 
		boolean isCheck2 = sum >= 60;
		boolean result = isCheck1 && isCheck2;
		
		if(result) {
			System.out.println("�հ��Դϴ�!");
		}else {
			System.out.println("���հ��Դϴ�!");
		} // 21���� �Է½� �հ����
		
		if(a >= 21 || b >= 21 || c >= 21 || d >= 21 || e >= 21) {
			System.out.println("���Է� �ϼ���");	
		}else if(a < 8 || b < 8 || c < 8 || d < 8 || e < 8) {
			System.out.println("���հ� �Դϴ�!");
		}else if(sum >= 60){
			System.out.println("�հ��Դϴ�!");
		}else {
			System.out.println("���հ� �Դϴ�!");
		}
		
		sc.close();
	}

}
