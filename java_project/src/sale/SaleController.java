package sale;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleController {
	
	
	private String proID, name;
	private int price;
	
	private int orderNum;
	private int productCnt, cost;
	
	List<Menu> menuList = new ArrayList<>();
	List<Order> orderList = new ArrayList<>();
	        
	public void insertMenu(Scanner sc) {
		System.out.println("제품번호, 이름, 가격 작성");
		proID = sc.next();
		name = sc.next();
		price = sc.nextInt();
		
		Menu menuInfo = new Menu(proID, name, price); 
		menuList.add(menuInfo);
		System.out.println("메뉴가 추가되었습니다.");
	}

	public void deleteMenu(Scanner sc) {
		System.out.println("삭제할 제품의 이름을 작성하세요");
		String delProduct = sc.next();
		
		for(Menu m : menuList) {
			if(m.getName().equals(delProduct)) {			// == 아니고 equals().
				menuList.remove(m);
				System.out.println("제품이 삭제되었습니다.");
			}
		}
	}

	public void modifyMenu(Scanner sc) {
		System.out.println("수정할 제품의 이름을 작성하세요");
		String modifyName = sc.next();
		
		for(Menu m : menuList) {
			if(m.getName().equals(modifyName)) {
				System.out.println("수정할 제품 금액을 입력하세요.");
				int modifyPrice = sc.nextInt();
				m.setPrice(modifyPrice);
				System.out.println("금액이 수정되었습니다.");
			}
		}
	}

	public void printMenu() {
		for(Menu m : menuList) {
//			System.out.println(m);
			System.out.println(m.getProID() + " " + m.getName() + " " + m.getPrice());
		}
	}

	public void orderMenu(Scanner sc) {
		
	}

	public void orderPrint() {
		
		
	}

	public void totalSale() {
		
	}

}
