
public class Exam04 {

	public static void main(String[] args) {
		// switch 조건문 - 값이 나오는 식을 가지고 T,F 판단 , 비교연산자 사용 불가
		// 정해진값 - switch , 범위값 - if
		int num = 1;
		// num의 값이 10이면 안녕하세요를 출력
		// 20이면 안녕히가세요 , 30이면 어서오세요 출력
		// 이 이외의 숫자를 입력하면 정확한 숫자가 아닙니다. 출력
		switch(num) {
			case 10 :
				System.out.println("안녕하세요");
				break;
			case 20 :
				System.out.println("안녕히가세요");
				break;
			case 30 :
				System.out.println("어서오세요");
				break;
			default :
				System.out.println("정확한 숫자가 아닙니다.");
				break;
		}
		
		
		

	}

}
