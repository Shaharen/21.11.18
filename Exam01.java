import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 정수를 입력받아 홀수 짝수 판별
		Scanner sc = new Scanner(System.in);
		int num = 100; 			// 노란줄 - 경고  예) 변수 선언 후 사용 X
		System.out.print("정수를 입력 하세요 : ");
		int input = sc.nextInt();
		if(input % 2 == 0) {
			System.out.println(input + "는(은) 짝수입니다.");
		}else {
			System.out.println(input + "는(은) 홀수입니다.");
		}
		/* if(num % 2 == 0) {
		  System.out.println(num + "는(은) 짝수입니다.");
		}
		if(num % 2 == 1) {
		  System.out.println(num + "는(은) 홀수입니다.");
		} 
		*/
		sc.close();  // 스캐너 사용 끝 => 위 sc의 노란줄 제거됨

	}

}

