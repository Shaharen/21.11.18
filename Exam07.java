import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// ���� �Է¹޾� �� ���� ���� �ܿ� �� �´� ���� ���
		// 3 4 5 -> ��
		Scanner sc = new Scanner(System.in);

		System.out.print("�� �Է� : ");
		int month = sc.nextInt();

		switch (month) { // month / 3
		case 12, 1, 2 :	// 4, 0
			System.out.println(month + "���� �ܿ��Դϴ�.");
			break;
		case 3, 4, 5 :	// 1
			System.out.println(month + "���� ���Դϴ�.");
			break;
		case 6, 7, 8 :	// 2
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 9, 10, 11 :// 3
			System.out.println(month + "���� �����Դϴ�.");
			break;
		}// ���� 12�̻���� case ���ľ��� ����
		
		sc.close();

	}

}
