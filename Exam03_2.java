import java.util.Scanner;

public class Exam03_2 {

	public static void main(String[] args) {
		// ��� 92.32 (A) / 82.27(B) / 75.32(C) �Ҽ��� ��°������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		double math = sc.nextDouble();		// int math = sc.nextInt();
		System.out.print("���� ���� : ");
		double eng = sc.nextDouble();		// int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		double sci = sc.nextDouble();		// int sci = sc.nextInt();
		
		double ev = (math + eng + sci) / 3; // double ev = (math + eng + sci) / 3.0 ;
		double ev2 = ev*100;				// int change1 = (int)(ev * 100);
		int ev3 = (int)ev2;					// double result = change1 * 0.01;
		float result = ev3 / 100f;
		// ���� int�� ������ ��� ��� = ev/100 + . + ev%100
		
		System.out.print("��� : "+ result + "�� ");
		if(result >= 90) {
			System.out.println("A�����Դϴ�.");
		}else if(result >= 80) {
			System.out.println("B�����Դϴ�.");
		}else if(result >= 70) {
			System.out.println("C�����Դϴ�.");
		}else {
			System.out.println("F�����Դϴ�.");
		}
		/* System.out.println(ev);
		System.out.println(ev2);
		System.out.println(ev3);
		System.out.println(result);
		*/
		sc.close();
	}
// 921 931 781 87.7666666 B
}
