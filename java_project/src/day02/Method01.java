package day02;
import java.util.Scanner;

public class Method01 {

	public static void main(String[] args) {
		/* 메서드 (Method) : function 기능(함수)
		 * 메서드 선언 및 구현
		 * 접근제한자(제어자) 리턴타입 매서드명(매개변수){
		 * 	기능구현;
		 * }
		 * - 접근제한자(제어자) : 접근할 수 있는 주체의 제한범위
		 * - 리턴타입 : 리턴할 값의 타입(타입으로만 기재)
		 * - 메서드명 : 소문자로 시작
		 * - 매개변수 : 기능을 수행하기 위해 필요로 하는 값(외부에서 들어와야 하는 값)
		 * - void : 리턴할 값이 없다는 것을 의미
		 * 
		 * 
		 * - 메서드의 선언 위치
		 * - 클래스 안, 다른 매서드 밖
		 * - 메서드의 선언 순서는 상관없음.
		 * - 메서드는 순서대로 실행되는 것이 아니라 호출되어야 실행
		 * - 메서드의 호출은 다른 메서드에서도 가능. 다른 클래스의 메서드에서도 가능.(접근권한이 된다면.)
		 * 
		 * - 접근권한
		 * - public : 누구나 사용 가능(모두 가능)
		 * - protected : 나 + 패키지 + 자식클래스(상속을 위해서 사용)
		 * - (default) : 나 + 패키지
		 * - private : 나
		 * 
		 * - private < default < protected < public
		 * */
		int a, b = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
			
			Method01 calc = new Method01();
						
			System.out.println("정수 두 개 입력");
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println("사칙연산 입력");
			String x = sc.next();
			
			if(x == "+") {
				result = calc.plus(a,b); // static 메서드 호출
			}
			else if(x=="-") {
				result = calc.minus(a,b);
			}
			else if(x=="*") {
				result = calc.mul(a,b);
			}
			else if(x=="/") {
				result = calc.disc(a,b);
			}
			System.out.println("입력받은 값 : " + a +", "+ b + "연산자 : " + x); 
			System.out.println("사칙연산의 값 : "+ result);
			
//			System.out.println(result1);
			
			// static이 없는 메서드는 객체 생성 후 호출
			// 내 클래스의 객체 생성
//			Method01 m = new Method01(); 
//			int result2 = m.sum2(a,b);	// 메서드의 공간을 생성하고 공간에 메서드를 선언.
//			System.out.println("입력받은 값 : " + a +", "+ b);
//			System.out.println("sum2의 값 : "+ result2);
			
		sc.close();
	}
	// 다른 메서드의 위치 공간
	// 두 정수의 값을 매개변수로 주고, 두 수 의 합을 리턴하는 메서드
	// 리턴 타입 : 합 => int(정수)
	// 메서드명 : sum
	// 매개변수 : 두 정수 => int num1, int num2
	public static int sum1(int num1, int num2) {
		System.out.println("입력받은 값 : " + num1 +", "+ num2); 
		System.out.println("sum1의 값 : "+ (num1+num2));
		return num1 + num2;
	}
	public int sum2(int num1, int num2) {
		return num1 + num2;
	}
	
	public int plus(int num1, int num2) {
		return num1 + num2;
	}
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	public int disc(int num1, int num2) {
		return num1 / num2;
	}
}
