import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// switch������ ������ �Է¹޾� Ȧ������ ¦������ �Ǻ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int d = num % 2 ;
		
		switch (d) {
			case 0 :
				System.out.println("¦���Դϴ�!");
				break;
			case 1 :
				System.out.println("Ȧ���Դϴ�!");
				break;
		}
		sc.close();

	}

}
