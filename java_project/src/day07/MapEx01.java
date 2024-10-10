package day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능
		 * -- 단어장 --
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * 
		 * map 저장 후 출력
		 */
		int size = 5;
		String eng, kor;
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> list = new HashMap<>();
		System.out.println("영어, 한글 순서로 입력");
		// 공백 허용 : sc.nextLine();
		// enter 콘솔 입력 시 완료
		// nextLine() : enter 값으로 인지하는 케이스는
		// 다른 입력값 -> nextLine()이 오는 케이스
		for(int i=0; i<size; i++) {
			eng = sc.next();
			kor = sc.next();
			list.put(eng, kor);
		}
		System.out.println("-- 단어장 --");
		for(String tmp : list.keySet()) {
			System.out.println(tmp + " : " + list.get(tmp));
		}
		
		
		sc.close();
	}

}
