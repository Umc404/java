package day03;

public class CardMain {

	public static void main(String[] args) {
//		 Card c = new Card();
		 CardPack cp = new CardPack();	
//			c.setNumber();
//			c.setShape();
//			c.print();
		 
		 cp.shuffle();
		 
		 int cnt = 0;
		 for(int i=9; i<4; i++) {
			 for(int j=0; j<13; j++) {
				 cp.getPack()[cnt].print();
				 cnt++;
			 }
			System.out.println();
		 }
		 System.out.println("-------------------");
			System.out.println("딜러가 카드를 나누고 있습니다. ");
			Card player1 = cp.pick();
			Card player2 = cp.pick();
			Card player3 = cp.pick();
			Card player4 = cp.pick();
			Card player5 = cp.pick();
			System.out.println("카드를 모두 나누었습니다.");
			System.out.print("player1 : ");
			player1.print();
			System.out.print(" / player2 : ");
			player2.print();
			System.out.print(" / player3 : ");
			player3.print();
			System.out.print(" / player4 : ");
			player4.print();
			System.out.print(" / player5 : ");
			player5.print();
		 
	}

}