import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// ����, ����, ���������� �Է¹޾� ��� 90�� �̻��̸� A�����Դϴ�.
		// 80 ~ 90 B�����Դϴ�.  70 ~ 80 C�����Դϴ�. �� �ܿ��� F�����Դϴ� ���
		// 100���̻��� ����
		// �߰� : ��� 92.32 (A) / 82.27(B) / 75.32(C) �Ҽ��� ��°������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int sci = sc.nextInt();
		
		int ev = (math + eng + sci) / 3;
		
		boolean isCheck1 = ev >= 90;
		boolean isCheck2 = ev >= 80 && ev <= 89;
		boolean isCheck3 = ev >= 70 && ev <= 79;
		
		if(ev >= 90) {
			System.out.println("A�����Դϴ�.");
		}else if(ev >= 80) {
			System.out.println("B�����Դϴ�.");
		}else if(ev >= 70) {
			System.out.println("C�����Դϴ�.");
		}else {
			System.out.println("F�����Դϴ�.");
		}
		
		if(isCheck1) {
			System.out.println("A�����Դϴ�.");
		}else if(isCheck2) {
			System.out.println("B�����Դϴ�.");
		}else if(isCheck3) {
			System.out.println("C�����Դϴ�.");
		}else {
			System.out.println("F�����Դϴ�.");
		}
	
		sc.close();
		
		
	}

}
