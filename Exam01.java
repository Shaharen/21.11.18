import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// ������ �Է¹޾� Ȧ�� ¦�� �Ǻ�
		Scanner sc = new Scanner(System.in);
		int num = 100; 			// ����� - ���  ��) ���� ���� �� ��� X
		System.out.print("������ �Է� �ϼ��� : ");
		int input = sc.nextInt();
		if(input % 2 == 0) {
			System.out.println(input + "��(��) ¦���Դϴ�.");
		}else {
			System.out.println(input + "��(��) Ȧ���Դϴ�.");
		}
		/* if(num % 2 == 0) {
		  System.out.println(num + "��(��) ¦���Դϴ�.");
		}
		if(num % 2 == 1) {
		  System.out.println(num + "��(��) Ȧ���Դϴ�.");
		} 
		*/
		sc.close();  // ��ĳ�� ��� �� => �� sc�� ����� ���ŵ�

	}

}

