import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// int Ÿ�� total Score �����ϰ� �Է¹ޱ�
		// 90�� �̻� A���� , 80���̻� 90�� �̸� B����, 70���̻� 80�̸� C����, 70�̸� D����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int totalScore = sc.nextInt();
		int ts = totalScore >= 90 ? 0 : (totalScore >= 80 ? 1 : (totalScore >= 70 ? 2 : 3));
		// int ts = totalScore / 10; ���� �Ǻ� ����
		/* switch(ts) {
		 * case 10 :
		 * case 9 :
		 * 	System.out.println("A�����Դϴ�.");
				break;
		 * case 8 :
		 * 	System.out.println("B�����Դϴ�.");
				break;
		 * case 7 :
		 * 	System.out.println("C�����Դϴ�.");
				break;
		 * default :
		 * 	System.out.println("D�����Դϴ�.");
				break;
		 * 
		 */
		switch (ts) {
			case 0 :
				System.out.println("A�����Դϴ�.");
				break;
			case 1 :
				System.out.println("B�����Դϴ�.");
				break;
			case 2 :
				System.out.println("C�����Դϴ�.");
				break;
			default :
				System.out.println("D�����Դϴ�.");
				break;
		}
		
		sc.close();
		
		

	}

}
