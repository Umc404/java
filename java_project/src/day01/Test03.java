package day01;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		/* Scanner 클래스 : 콘솔에서 값을 입력받을 때 사용
		 * (int)(Math.random()*개수)+시작 : 시작값부터 개수만큼 정수형 랜덤값 생성
		 * 
		 * */
		// 값을 입력받으려면 Scanner scan = new Scanner(System.in);
		
		// 주사위 값 랜덤 발생
//		System.out.println(random);
		
		// 랜덤으로 주사위를 굴려 총 30칸을 이동하세요.
		// 주사위 던진 횟수 출력
		/* 주사위 게임
		 * 주사위는 Enter를 치면 던져짐
		 * 주사위 : 3
		 * 3칸 전진 => 27칸 남음
		 * 주사위 : 5
		 * 5칸 전진 => 22칸 남음.
		 * ....
		 * 도착! 총 던진횟수 >> ?? */
		
//		for(int i=0; i<=10; i++) {
//			// 처리 0부터 10까지 1씩 반복
//		} 반복횟수가 정해질 경우
//		while(식) {
//			처리;
//		} 횟수가 일정하지 않을 경우.
		// enter 인지 => scanner 사용
		Scanner scan = new Scanner(System.in);
			
			int sum = 0;
			int count = 0;
			int last = 30;
			int random = 0;
			
			System.out.println("게임시작. 주사위 던저주세요.(enter)");
			
			// 주사위는 30칸을 이동할 동안 반복해서 던져야 함.
			
			while(sum<last) { // 거리 누적값이 30보다 작으면 실행.
				random = (int)(Math.random()*6)+1;
//				System.out.println(random);
				scan.nextLine(); // next() : Enter 처리불가
//				System.out.println(random);
				sum += random;
				count++;
				System.out.println("주사위 : " + random);
				System.out.println("이동 횟수 : " + count);
				if ((last-sum) <= 0) {
					System.out.println("도착. 총 이동횟수 : " + count);
				} else {
					System.out.println(random + "칸 전진 => " + (last - sum) + "칸 남았습니다.");
				}
			}
//			System.out.println("도착. 총 이동횟수 : " + count);
			
			// ctrl + shift + f : 들여쓰기 자동 정렬
		
		scan.close();
	}

}
