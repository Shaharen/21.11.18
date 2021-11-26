import java.util.Scanner;

public class Exam03_2 {

	public static void main(String[] args) {
		// 평균 92.32 (A) / 82.27(B) / 75.32(C) 소수점 둘째까지만 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학 점수 : ");
		double math = sc.nextDouble();		// int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		double eng = sc.nextDouble();		// int eng = sc.nextInt();
		System.out.print("과학 점수 : ");
		double sci = sc.nextDouble();		// int sci = sc.nextInt();
		
		double ev = (math + eng + sci) / 3; // double ev = (math + eng + sci) / 3.0 ;
		double ev2 = ev*100;				// int change1 = (int)(ev * 100);
		int ev3 = (int)ev2;					// double result = change1 * 0.01;
		float result = ev3 / 100f;
		// 전부 int로 선언할 경우 평균 = ev/100 + . + ev%100
		
		System.out.print("평균 : "+ result + "점 ");
		if(result >= 90) {
			System.out.println("A학점입니다.");
		}else if(result >= 80) {
			System.out.println("B학점입니다.");
		}else if(result >= 70) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("F학점입니다.");
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
