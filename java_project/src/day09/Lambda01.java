package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		/* Lambda + Stream => 람다와 스트림
		 * javascript arrowFunction(화살표함수)와 비슷한 형태
		 * lambda : 람다식 (식을 단순하게 표현하는 방법)
		 * 		외부 자료의 부수적인 영향(side effect)을 주지 않도록 구현하는 방법
		 * Stream : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * - 메서드 체이닝 기법을 사용
		 * 
		 * Lambda functions : 익명클래스를 사용하여 쓰는 함수
		 * 람다식의 장점 : 코드 간결성, 병렬처리 가능, 불필요한 연산 최소화
		 * 단점 : 가독성이 떨어짐. 반복문 사용 시 성능 저하.
		 * 
		 * - 람다의 표현식
		 * const name = () => {} // javascript 방식
		 * (매개변수) -> {구현} // java lambda
		 * 매개변수가 1개면 () 생략 가능
		 * x -> { return x+1; }
		 *  (x, y) -> { return x+y }
		 *  
		 *  return이 없으면 {생략 가능}
		 *  x -> x+1;
		 *  x -> return x+1;	// 오류
		 */
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(80);
		list.add(20);
		list.add(80);
		list.add(90);
		list.add(40);
		
		for(Integer tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("---- forEach ----");
		list.forEach(n -> {
			System.out.print(n + " ");			// stream으로 복사본을 받아 처리.
		});
		System.out.println();
//		int sum = 0;
		// stream을 구성. / side effect를 최소화할 수 있게
//		list.forEach(n -> {
//			int sum = 0;
//			sum += n;
//		});
		
		// 람다함수(익명함수)
		System.out.println("---- lambda함수 Consumer ----");
		// 람다함수(익명함수) 구현 -> 실행
		Consumer<Integer> method = (n) -> {
			System.out.print(n + " ");
		};
		list.forEach(method);
	}

}
