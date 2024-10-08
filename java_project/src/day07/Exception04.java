package day07;

public class Exception04 {

	public static void main(String[] args) {
		/* 빨간줄 안긋어져도 에러는 날 수 있음. // unchecked exception
		 * 
		 * 멀티 캐치 구문, 다중 캐치 구문
		 * try {
		 * } catch(예외 클래스명1 객체) {
		 * 
		 * } catch(예외 클래스명2 객체) {
		 * 
		 * }
		 * 예외를 구체적으로 세분화해서 잡고싶을 때 => 멀티 캐치
		 * 모든 예외의 최고 조상 : Exception
		 * 어떤 예외가 발생하던 싹 다 캐치
		 * 
		 * */
		double res = 0;
		
		try {
			int arr[] = null;
			arr[1] = 3;
			int arr1[] = new int[3];
			arr1[1] = 3;
			res = 1/0;
		} catch(NullPointerException e) {
			System.out.println("객체가 null 입니다.");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
			e.printStackTrace();
		}	catch(Exception e) {
			// 최고 조상이라 세부적인 Exception 발생 시 다 캐치. 마지막 처리
			e.printStackTrace();
		}
		System.out.println("종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
