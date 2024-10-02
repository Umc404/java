package day04;
import java.util.Scanner;

class Product {
	private String name;
	private int price;
	
	public Product() {}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 메서드 : 상품추가 toString
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "name=" + name + ", price=" + price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class Report01_sol {
	public static void main(String[] args) {
//		Product p = new Product("사탕",500);
//		System.out.println(p);
		
		Scanner s = new Scanner(System.in);
		
		Product[] p = new Product[10];
		
		char c = 'y'; // 반복 키워드
		int cnt = 0; // index 변수
		
		while(c != 'n') { // String c : !(c.equals("n"))
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			c = s.next().charAt(0); // 한글자 입력 : charAt(0)
			if(c == 'y') {
				System.out.println("상품명 >");
				String name = s.next();
				System.out.println("가격 >");
				int price = s.nextInt();
				
				Product pro = new Product();
				pro.insertProduct(name, price); // 추가 메서드 호출
				p[cnt] = pro;
				cnt++;
				
			} else { 
				if(c =='n') {
					System.out.println("상품등록 종료");
				} else {
					System.out.println("y/n만 가능합니다.");
				}
			}
			
		}
		
		System.out.println("---- 등록 상품 리스트 ----");
		for(int i=0; i<cnt; i++) {
			System.out.println(p[i]);
		}
		
		s.close();
	}
}
