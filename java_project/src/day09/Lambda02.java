package day09;

import java.util.HashMap;

public class Lambda02 {
	public static void main(String[] args) {
		// map을 forEach 로 출력
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("kim", 86);
		map.put("jang", 68);
		map.put("jung", 74);
		map.put("lee", 71);
		map.put("choi", 56);
		map.put("park", 76);
		
		// Consumer : 값이 1개 / BiConsumer : 값이 2개
		map.forEach((x,y) -> {
			System.out.println(x+" : "+y);
		});
		
		Number sum = (a, b) -> {
			return a+b;
		};
		
		int tot = sum.add(50, 60);
		System.out.println(tot);
	}
}

// 함수형 인터페이스 생성
// 메서드가 1개여야만 함.
@FunctionalInterface
interface Number {
	int add(int a, int b);
//	int sub(int a, int b);		// FunctionalInterface : 메서드가 2개면 에러. 반드시 한개.
}