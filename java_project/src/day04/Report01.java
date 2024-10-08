package day04;
import java.util.Scanner;
/* Product 클래스 생성 : 상품 등록 클래스
 * 상품명(name) , 가격(price) 을 멤버변수로 생성
 * 상품을 추가 메서드
 * 상품출력 메서드 (toString) 사용
 * ex) 	사탕 : 500
 * 		과자 : 2000
 * 		젤리 : 1000
 */
class Product1 {
	private String name;
	private int price;
	private int cnt;
	
	private String[] productName = new String[10];
	private int[] productPrice = new int[10];
	
	public Product1() {}
	public Product1(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 메서드
	public void productInfo() {
		System.out.println(name +" : "+price);
	}
	public void registProduct(String name, int price) {
		if(cnt >= 10) {
			System.out.println("이 이상 등록이 불가합니다.");
		}
		this.productName[cnt] = name;
		this.productPrice[cnt] = price;
	}
	
	//getter / setter
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
	public String[] getProductName() {
		return productName;
	}
	public void setProductName(String[] productName) {
		this.productName = productName;
	}
	public int[] getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int[] productPrice) {
		this.productPrice = productPrice;
	}
	
}

public class Report01 {
	public static void main(String[] args) {
		/* 상품 10개를 등록할 수 있는 배열 생성
		 * 스캐너를 통해 상품 등록.
		 * 등록한 상품을 출력
		 * 
		 * 상품을 등록하시겠습니까? (y/n) 등록 / n => 그만
		 * do-while
		 * 
		 */
		String x = "";
		boolean yesOrNo = true;
		String productName = "";
		int productPrice = 0;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			x = sc.nextLine();
			
			if(x == "y") {
				yesOrNo = true;
			} else if(x == "n") {
				yesOrNo = false;
			}
			switch(x) {
			case "y":
				System.out.println("상품을 입력하세요.");
				productName = sc.nextLine();
				System.out.println("가격을 입력하세요.");
				productPrice = sc.nextInt();
				System.out.println(productName + " "+productPrice );
				break;
			case "n":
				System.out.println("입력을 종료합니다.");
				// 대충 배열 반복해서 출력하는거.
				break;
			}
			
		} while(yesOrNo);
		
	sc.close();
	}
}
