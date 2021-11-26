import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// 금액을 입력 받고 메뉴 소개, 메뉴 입력 받고 잔돈 출력
		// 추가 : 입력 받은 금액이 적을 경우 돈이 부족하다는 문장 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		System.out.println("메뉴를 고르세요");
		System.out.print("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >> ");
		int menu = sc.nextInt();

		int change1 = money - 800;
		int change2 = money - 500;
		int change3 = money - 1500;
		
		// 최소화
		int result = 0;
		switch(menu) {
		case 1 :
			result = money - 800;
			break;
		case 2 : 
			result = money - 500;
			break;
		case 3 :
			result = money - 1500;
			break;
		}
		if(result<0) {
			System.out.println("돈이 부족합니다");
		}else {
			System.out.println("맛있게 드세요");
		}
		System.out.println("잔돈은 : "+ result);
		
		// 1.
		switch (menu) {
		case 1:
			System.out.println("잔돈 : " + change1 + "원");
			break;
		case 2:
			System.out.println("잔돈 : " + change2 + "원");
			break;
		case 3:
			System.out.println("잔돈 : " + change3 + "원");
			break;
		}
		
		// 2.
		if (menu == 1) {
			System.out.println("잔돈 : " + change1 + "원");
		} else if (menu == 2) {
			System.out.println("잔돈 : " + change2 + "원");
		} else {
			System.out.println("잔돈 : " + change3 + "원");
		}
		
		// 3.
		int change = 0;
		switch (menu) {
		case 1:	
			if(money >= 800) {
				change = change1;
			}else {
				change = money;
				System.out.println("돈이 부족해요ㅠㅠ");
			}
			break;
		case 2:
			change = change2;
			break;
		case 3:
			change = change3;
			break;
		}
		System.out.println("잔돈 : " + change + "원");
		
		// 4.
		System.out.println(4);
		switch (menu) {
		case 1 :
			change = money >= 800 ? change1 : money;
			break;
		case 2 :
			change = money >= 500 ? change2 : money;
			break;
		case 3 : 
			change = money >= 1500 ? change3 : money;
			break;
		}
		if(change == money ) {
			System.out.println("돈이 부족해요");
		}
		System.out.println("잔돈 : " + change + "원");
		
		sc.close();
		
	}
		
}

