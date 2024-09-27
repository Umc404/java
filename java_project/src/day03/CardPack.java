package day03;
/* 카드 한 묶음을 나타내는 클래스
 *  ◆ ♣ ♠ ♥
 *  ◆1~13  ♣1~13  ♠1~13  ♥1~13 => 52장의 카드로 구성
 *  52장의 카드를 담을 수 있는 배열 (카드 한묶음 배열) - 멤버변수
 *  
 *  생성자 - 52장의 카드를 순서대로 생성되게 만들기
 *  메서드
 *  - 카드 출력기능 : Card class => print() 사용
 *  - 카드 초기화 기능
 *  - 카드 한장을 나눠주는 기능
 *  - 카드를 섞는 기능
 */

public class CardPack {
	
	private Card pack[] = new Card[52];
	
	// 카드의 index를 체크하기 위한 변수
	private int cnt = 0;
	
	
	public CardPack() {
		String shape = "◆";
		//52장의 카드를 생성하여 배열에 넣기
		// num : 1~13 / shape  ◆ ♣ ♠ ♥
		// 이중 for문 활용.
		// 4가지 모양, 1~13까지의 숫자 반복하여 생성
		for(int i=1; i<=4; i++) {  // 4가지 모양을 넣기위해 반복
			switch(i) {
				case 1: shape = "◆"; break;
				case 2: shape = "♣"; break;
				case 3: shape = "♠"; break;
				case 4: shape = "♥"; break;
			}
			for(int j=1; j<=13; j++) {
				Card c = new Card();
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	// 카드를 섞는 기능
	// shuffle
	// 랜덤번지를 하나 뽑아서 순서대로 0번지부터 서로 교환
	public void shuffle() {
		for(int i=0; i<pack.length; i++) {
			int random = (int)(Math.random()*pack.length); // 0 ~ 51
			Card tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	}
	// 카드 한장을 빼서 나눠주는 기능
	// pick(): 카드 한장을 리턴
	public Card pick() {
		if(cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	// 카드를 초기화하는 기능
	public void init() {
		cnt = 52;
	}
	// getter / setter
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
}

