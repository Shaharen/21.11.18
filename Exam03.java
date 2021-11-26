import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 수학, 영어, 과학점수를 입력받아 평균 90점 이상이면 A학점입니다.
		// 80 ~ 90 B학점입니다.  70 ~ 80 C학점입니다. 그 외에는 F학점입니다 출력
		// 100점이상은 제외
		// 추가 : 평균 92.32 (A) / 82.27(B) / 75.32(C) 소수점 둘째까지만 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("과학 점수 : ");
		int sci = sc.nextInt();
		
		int ev = (math + eng + sci) / 3;
		
		boolean isCheck1 = ev >= 90;
		boolean isCheck2 = ev >= 80 && ev <= 89;
		boolean isCheck3 = ev >= 70 && ev <= 79;
		
		if(ev >= 90) {
			System.out.println("A학점입니다.");
		}else if(ev >= 80) {
			System.out.println("B학점입니다.");
		}else if(ev >= 70) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		
		if(isCheck1) {
			System.out.println("A학점입니다.");
		}else if(isCheck2) {
			System.out.println("B학점입니다.");
		}else if(isCheck3) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
	
		sc.close();
		
		
	}

}
