package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		// 키오스크
		/* 금액 수량에 맞게 가격 계산
		 * 메뉴 추가 수정 삭제
		 * 1. menu 추가
		 * 2. menu 삭제
		 * 3. menu 수정(가격 수정) \n
		 * 4. 메뉴 보기
		 * 5. 주문
		 * 6. 주문내역 출력(영수증)
		 * 7. 종료 \n
		 */
		SaleController k = new SaleController();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("1. menu 추가 | 2. menu 삭제 | 3. menu 수정");
			System.out.println("4. menu list | 5. 주문 | 6. 주문내역 출력");
			System.out.println("7. 전체 판매내역 | 8. 종료");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				k.insertMenu(sc);
				break;
			case 2:
				k.deleteMenu(sc);
				break;
			case 3:
				k.modifyMenu(sc);
				break;
			case 4:
				k.printMenu();
				break;
			case 5:
				k.orderMenu(sc);
				break;
			case 6:
				k.orderPrint();
				break;
			case 7:
				k.totalSale();
				break;
			case 8:
				System.out.println("뿅");
				break;
			}
			
		} while(menu < 8);
		
	}

}
