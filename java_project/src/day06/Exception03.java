package day06;

public class Exception03 {

	public static void main(String[] args) {
		/* 자주 발생하는 예외코드들
		 * ArithmeticException : 0으로 나누었을 때 발생
		 * ArrayIndexOutOfBoundsException : 배열의 index 가 범위를 벗어났을 때
		 * NullPointException : 객체 값이 NULL일 때
		 * ClassCastException : 다운 캐스팅이 잘못 되었을 경우.
		 */
		int arr[] = null;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
