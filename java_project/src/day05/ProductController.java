package day05;

import java.util.Scanner;

public class ProductController {
	// product 배열 생성
	// 추가, 삭제, 수정, 리스트 보기
	
	private Product[] menu = new Product[10];
	private int cnt = 0; // index
	
	private String name;
	private int price;
	
	public void printProduct() {
		
		for(int i=0; i<menu.length; i++) {
			if(menu[0] == null) {
				System.out.println("등록된 상품이 없습니다.");
				return;
			}
			if(menu[i] != null) {
				System.out.print(i+1 +". ");
				System.out.println(menu[i]);
			}
		}
	}
	public void insertProduct(Scanner sc) {
		// 배열이 다 찼으면 배열 늘려야함.
		// 더 긴 길이의 배열을 생성하여 배열 복사 후 배열 교체
		if(cnt == menu.length) {
			Product[] tmp = new Product[menu.length+5];
			// 배열 복사. 기존배열의 0번지부터 새배열의 0번지부터 cnt 개수만큼 복사
			System.arraycopy(menu, 0, tmp, 0, cnt);
			menu = tmp;  // 처리하지 않으면 확장복사된 tmp는 선언만 될 뿐 출력되지 않음. 메서드에 선언된 확장 전 menu만 선언
		}
		
		System.out.println("상품의 이름과 가격을 입력하세요.");
		System.out.print("상품명 >");
		name = sc.next();
		System.out.print("가격 >");
		price = sc.nextInt();
		
		Product pro = new Product();
		pro.insertProduct(name, price);
		menu[cnt] = pro;
		cnt++;
		
	}
	public void deleteProduct(Scanner sc) {
		System.out.println("삭제할 상품의 이름을 입력하세요.");
		name = sc.next();
		
//		for(int i=0; i<menu.length; i++) {
//			if(menu[i] != null) {
//				if(menu[i].getName().equals(name)) {
//					menu[i] = menu[i+1];
//					menu[menu.length-1] = null; 
//				}
//			}
//		}
//		System.out.println("삭제가 완료되었습니다.");
//		cnt--;
		// -----------------------------------------------------
		int index = -1; // 없는 번지를 기본값으로 설정

		for(int i =0; i<cnt; i++) {
			if(menu[i].getName().equals(name)){
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("찾는 상품이 없습니다.");
			return;
		}
		// 삭제 : 찾는 위치부터 뒷번지를 앞번지로 옮기는 작업
//		for(int i=index; i<cnt-1; i++) {
//			menu[i] = menu[i+1];
//		}
		
		// arraycopy를 이용한 방법 => 속도가 빠름. (성능 우수)
		// 배열복사 기존배열의 0번지부터 새배열의 0번지부터 복사 cnt 개수만큼 복사.
		int copyCnt = menu.length - index - 1;
		System.arraycopy(menu, index+1, menu, index, copyCnt);
		
		
		// 끝번지는 null
		menu[cnt-1] = null;
		cnt--;
		printProduct(); // 삭제 후 출력
		
	}
	public void modifyProduct(Scanner sc) {
		// 상품수정 : 금액만 수정하도록 처리.
		System.out.println("수정할 상품의 이름을 입력하세요.");
		name = sc.next();
		
		for(int i=0; i<menu.length; i++) {
			if(menu[i] != null) {
				if(menu[i].getName().equals(name)) {
					System.out.println("수정할 가격을 작성하세요");
					price = sc.nextInt();
					menu[i].setPrice(price);
					return;
				}
			}
		}
		System.out.println("찾는 상품이 없습니다.");
	}
	
	public Product[] getMenu() {
		return menu;
	}
	public void setMenu(Product[] menu) {
		this.menu = menu;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	
}
