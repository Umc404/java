package day07;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목 점수 입력받아 map 에 저장 후 출력 (Scanner)
		 * 합계 평균 출력
		 * 종료 키워드가 나올때까지 반복(1. 계속, 2. 종료)
		 * 
		 * 과목/점수 입력 > 국어 78
		 * 1 계속 2 종료 > 1	 * 
		 * 영어 98 반복
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		String sub = "";
		int grade = 0, sum = 0, cnt = 0;
		int x = 1;
		double avg = 0;
		
		HashMap<String, Integer> list = new HashMap<>();
		
		
		do {
			System.out.println("과목 / 점수 입력 >");
			sub = sc.next();
			grade = sc.nextInt();
			list.put(sub, grade);
			System.out.println("1 : 계속, 0 : 종료");
			x = sc.nextInt();
		} while(x != 0);
		
		System.out.println(list);
		for(String key : list.keySet()) {
			sum += list.get(key);
			cnt++;
			System.out.println(key + ":" + list.get(key));
		}
		avg = sum / cnt;
		System.out.println("합계 : " + sum + " 평균 : "+ avg);
		//		System.out.println(sub +" : " + grade);
		
		sc.close();
	}

}
