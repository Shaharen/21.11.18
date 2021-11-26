import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// int 타입 total Score 선언하고 입력받기
		// 90점 이상 A학점 , 80점이상 90점 미만 B학점, 70점이상 80미만 C학점, 70미만 D학점
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		int ts = totalScore >= 90 ? 0 : (totalScore >= 80 ? 1 : (totalScore >= 70 ? 2 : 3));
		// int ts = totalScore / 10; 으로 판별 가능
		/* switch(ts) {
		 * case 10 :
		 * case 9 :
		 * 	System.out.println("A학점입니다.");
				break;
		 * case 8 :
		 * 	System.out.println("B학점입니다.");
				break;
		 * case 7 :
		 * 	System.out.println("C학점입니다.");
				break;
		 * default :
		 * 	System.out.println("D학점입니다.");
				break;
		 * 
		 */
		switch (ts) {
			case 0 :
				System.out.println("A학점입니다.");
				break;
			case 1 :
				System.out.println("B학점입니다.");
				break;
			case 2 :
				System.out.println("C학점입니다.");
				break;
			default :
				System.out.println("D학점입니다.");
				break;
		}
		
		sc.close();
		
		

	}

}
