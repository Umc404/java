package day01;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex : 검색어를 입력받아 filename 배열에 검색어가 존재하면 해당 파일의 이름을 출력
		/* 검색어 : java 
		 * spring.java
		 * String.java
		 * 검색어 : s
		 * spring.java
		 * css.css
		 * String.java
		 * 검색어 : 가나다
		 * 검색결과가 없습니다. */
		
		Scanner scan = new Scanner(System.in);
		String[] fileName = {"spring.java","python.py","react.jsx","css.css","String.java",
				"component.jsx","text.txt"};
		
		System.out.println("검색어를 입력하세요.");
		String s = scan.next();
		int cnt = 0;
		
		System.out.println("검색어 : " + s);
//		for(int i=0; i<fileName.length; i++) {
//			if (filename[i].contains(s)) {
//				System.out.println(filename[i]);
//			}
//			else {
//				System.out.println("검색결과가 없습니다.");
//			}
		for(String tmp : fileName) {
			if(tmp.toLowerCase().contains(s.toLowerCase())) {
				System.out.println(tmp);
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println("검색결과가 없습니다.");
		}
		scan.close();
	}

}
