package sale;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleController {
	
	
	private String proID, name;
	private int price;
	
//	private int proID;		// 주문번호가 int일 경우. addMenu 주석 참조.
	
	private int orderNum;
	private int productCnt, cost;
	
	List<Menu> menuList = new ArrayList<>();
	List<Order> orderList = new ArrayList<>();
	        
	public void addMenu() {
		menuList.add(new Menu("S001","김치찌개",9000));
		menuList.add(new Menu("S002","부대찌개",9000));
		menuList.add(new Menu("S003","해장국",10000));
		menuList.add(new Menu("R001","제육볶음",9000));
		
		// proID : int 일 때
//		proID = 0;
//		menuList.add(new Menu(++proID,"제육볶음",9000));
//		menuList.add(new Menu(++proID,"부대찌개",9000));
//		menuList.add(new Menu(++proID,"해장국",10000));
//		menuList.add(new Menu(++proID,"제육볶음",9000));
		// auto_increment 처리
	}
	
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
		// 메뉴삭제 : remove(index), remove(object)
		// remove(object) : 하나의 개체 요소로 그 객체가전체 일치라고 볼 수 없음.
		// equals 명령어 자체를 수정하면 가능.
		
		// proID가 int인 경우
		/*
		int index = -1;
		System.out.println("삭제할 번호");
		int delmenu = sc.nextInt();
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i).getProID() == delMenu) {
				menuList.remove(i);
				menuList.remove(menuList.get(i));
			}
		}			*/
		
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
		System.out.println("##### 메뉴 리스트 #####");
		for(Menu m : menuList) {
			System.out.println(m);
//			System.out.println(m.getProID() + " " + m.getName() + " " + m.getPrice());
		}
	}

	public void orderPick(Scanner sc) {
		// 주문
		// 메뉴번호와 수량을 입력받아 / order 객체를 생성 후 / orderList 추가
		// order 객체를 생성. 필요한 메뉴명, 가격 menuList 찾아와야 함.
		System.out.println("주문 메뉴번호 >");
//		int pickMenu = sc.nextInt();
		String pickMenu = sc.next();
		System.out.println("수량 >");
		int count = sc.nextInt();
		
		Menu pick = null;
		
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i).getProID().equals(pickMenu)) { // int인 경우 '=='
				pick = menuList.get(i);
				break;
			}
		}
		
		if(pick == null) {
			System.out.println("주문번호가 없습니다.");
			return;
		}
		this.orderNum++;
		Order order = new Order(pickMenu, pick.getName(), pick.getPrice(), count, orderNum);
		System.out.println("주문 완료.");
		// orderPick 내 pickMenu가 int, 외부 메뉴번호가 String => 타입이 일치하지 않아 오류날 수 있음.
	}

	public void orderPrint() {
		int sum = 0;
		System.out.println("---- 주문내역 ----");
		for(Order o : orderList) {
			sum += o.getCost();
			o.orderPrint();
		}
	}

	public void totalSale() {
		
	}

}
