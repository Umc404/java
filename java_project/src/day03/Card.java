package day03;

/* 1장의 카드를 생성하기 위한 클래스
 * - 숫자 : 1~13 => 1(A), 11(J), 12(Q), 13(K)
 * - 모양 : ◆ ♣ ♠ ♥
 * - 한장의 카드를 출력하는 print() => ♥A ♠4 
 * - ◆11 => ◆J / ♣12 = ♣Q / ♠13 = ♠K
 * - #1 => ♥A / #25 = ♥A / ♣15 = ♣A
 * 
 * 클래스 구성
 * - 멤버변수 : 모양(shape), 숫자(num) => private getter / setter
 * - 메서드 : print()
 * - 생성자 : 기본생성자만 생성. => ♥A
 * - setShape("#") / setNum() : 설정할 수 있는 숫자와 모양을 제한  
 * 
 * */

public class Card {
	private String shape;
	private int num;

	public Card() {
		this.num = 1;
		this.shape = "♥";
	};
	
	public void setShape() {
		int random = (int)(Math.random()*4)+1;
		if(random == 1) {
			shape = "◆";
		}else if(random == 2) {
			shape = "♣";
		}else if(random == 3) {
			shape = "♠";
		}else{
			shape = "♥";
		}
	}
	
	public void print() {
		System.out.print(shape); // 모양
		switch(num) { // 번호
		case 1: System.out.print("A "); break;
		case 11: System.out.print("J "); break;
		case 12: System.out.print("Q "); break;
		case 13: System.out.print("K "); break;
		default : 
			System.out.print(num+" ");			
		}
	}
	// getter / setter
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		switch(shape) {
			case "◆": case "♣": case "♠": case "♥" :
				this.shape = shape;
				break;
			default :
				this.shape = "♥";
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num < 1 || num > 13) {
			this.num = 1;
		}else {
			this.num = num;			
		}
	}

}

//class Card {
//	private String shape;
//	private String num;
//
//	public Trump() {};
//	
//	public void setShape() {
//		int random = (int)(Math.random()*4)+1;
//		if(random == 1) {
//			shape = "◆";
//		}else if(random == 2) {
//			shape = "♣";
//		}else if(random == 3) {
//			shape = "♠";
//		}else{
//			shape = "♥";
//		}
//	}
//	
//	public void setNumber() {
//		int random = (int)(Math.random()*15)+1;
//		if(random == 11) {
//			num = "J";
//		} else if(random == 12) {
//			num = "Q";
//		} else if(random == 13) {
//			num = "K";
//		} else if (random == 1) {
//			num = "A";
//		}
//		else {
//			num = Integer.toString(random);
//		}
//		
//	}
//	public void print() {
//		System.out.println(shape+num);
//	}
//
//	public String getShape() {
//		return shape;
//	}
//
//	public void setShape(String shape) {
//		this.shape = shape;
//	}
//
//	public String getNum() {
//		return num;
//	}
//
//	public void setNum(String num) {
//		this.num = num;
//	}
//	
//}