package day01;

public class Test04 {

	public static void main(String[] args) {
		// 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합 (참조변수)
		// 타입 배열명[] = new int[개수];
		// 지역변수는 초기값이 없음. (안 정해주면 에러남)
		// 참조변수는 초기값이 있음. (숫자는 0, 문자는 null)
		
//		String s = new String("가나다");
		// String은 워낙 자주 사용하는 참조변수 => 일반 지역변수처럼 사용
//		String s1 = "asdf";
//		System.out.println(s);
//		System.out.println(s1);
		
		int arr[] = new int[5];
//		arr[0] += 1;
//		System.out.println(arr[0]);
//		System.out.println("배열 길이"+arr.length);
		
		// arr 배열에 숫자를 1,2,3,4,5 로 채우고 출력
		// arr.length = 총 길이 -1 번지를 가짐. 5개: 0 1 2 3 4
		for(int i=0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*6)+1;
			arr[i] = i+1;
			System.out.println(i + "번째 배열의 값 " + arr[i]);
		}
		System.out.println(arr);
	}

}
