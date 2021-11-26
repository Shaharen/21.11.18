import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// 월을 입력받아 봄 여름 가을 겨울 중 맞는 계절 출력
		// 3 4 5 -> 봄
		Scanner sc = new Scanner(System.in);

		System.out.print("월 입력 : ");
		int month = sc.nextInt();

		switch (month) { // month / 3
		case 12, 1, 2 :	// 4, 0
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3, 4, 5 :	// 1
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6, 7, 8 :	// 2
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9, 10, 11 :// 3
			System.out.println(month + "월은 가을입니다.");
			break;
		}// 버전 12이상부터 case 합쳐쓰기 가능
		
		sc.close();

	}

}
