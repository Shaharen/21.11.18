import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// �ݾ��� �Է� �ް� �޴� �Ұ�, �޴� �Է� �ް� �ܵ� ���
		// �߰� : �Է� ���� �ݾ��� ���� ��� ���� �����ϴٴ� ���� ���
		Scanner sc = new Scanner(System.in);

		System.out.println("�ݾ��� �Է��ϼ���.");
		int money = sc.nextInt();
		System.out.println("�޴��� ������");
		System.out.print("1. �ݶ�(800��) 2. ����(500��) 3. ��Ÿ�ο���(1500��) >> ");
		int menu = sc.nextInt();

		int change1 = money - 800;
		int change2 = money - 500;
		int change3 = money - 1500;
		
		// �ּ�ȭ
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
			System.out.println("���� �����մϴ�");
		}else {
			System.out.println("���ְ� �弼��");
		}
		System.out.println("�ܵ��� : "+ result);
		
		// 1.
		switch (menu) {
		case 1:
			System.out.println("�ܵ� : " + change1 + "��");
			break;
		case 2:
			System.out.println("�ܵ� : " + change2 + "��");
			break;
		case 3:
			System.out.println("�ܵ� : " + change3 + "��");
			break;
		}
		
		// 2.
		if (menu == 1) {
			System.out.println("�ܵ� : " + change1 + "��");
		} else if (menu == 2) {
			System.out.println("�ܵ� : " + change2 + "��");
		} else {
			System.out.println("�ܵ� : " + change3 + "��");
		}
		
		// 3.
		int change = 0;
		switch (menu) {
		case 1:	
			if(money >= 800) {
				change = change1;
			}else {
				change = money;
				System.out.println("���� �����ؿ�Ф�");
			}
			break;
		case 2:
			change = change2;
			break;
		case 3:
			change = change3;
			break;
		}
		System.out.println("�ܵ� : " + change + "��");
		
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
			System.out.println("���� �����ؿ�");
		}
		System.out.println("�ܵ� : " + change + "��");
		
		sc.close();
		
	}
		
}

