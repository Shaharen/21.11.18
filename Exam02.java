import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받기
		// 한과목이라도 정답이 8개 미만일경우 "불합격입니다!" 출력
		// 총 개수가 60개 이상이면  "합격입니다!"를 출력 ,과목당 최대 20문제임
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int a = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int b = sc.nextInt();
		System.out.print("OS : ");
		int c = sc.nextInt();
		System.out.print("데이터통신 : ");
		int d = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int e = sc.nextInt();
		int sum = a + b + c + d + e;
		
		boolean isCheck1 = a >= 8 && b >= 8 && c >= 8 && d >= 8 && e >= 8; 
		boolean isCheck2 = sum >= 60;
		boolean result = isCheck1 && isCheck2;
		
		if(result) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("불합격입니다!");
		} // 21문제 입력시 합격취급
		
		if(a >= 21 || b >= 21 || c >= 21 || d >= 21 || e >= 21) {
			System.out.println("재입력 하세요");	
		}else if(a < 8 || b < 8 || c < 8 || d < 8 || e < 8) {
			System.out.println("불합격 입니다!");
		}else if(sum >= 60){
			System.out.println("합격입니다!");
		}else {
			System.out.println("불합격 입니다!");
		}
		
		sc.close();
	}

}
