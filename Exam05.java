import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// switch문으로 정수를 입력받아 홀수인지 짝수인지 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int d = num % 2 ;
		
		switch (d) {
			case 0 :
				System.out.println("짝수입니다!");
				break;
			case 1 :
				System.out.println("홀수입니다!");
				break;
		}
		sc.close();

	}

}
