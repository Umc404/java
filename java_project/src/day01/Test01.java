package day01;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("hello world");
		// 한줄주석
		/*여러줄 주석*/
		// sysout ctrl+space : System.out.println();
		// 실행단축키 ctrl+f11
		/* js에서 let const 로 선언했었으나 
		 * java에서 타입별로 변수유형을 결정해야 함
		 * String 문자형 => 기본타입이 이난 참조형 타입
		*/
		// 변수타입 8가지
		// 변수는 범위(scope) {} 를 벗어나면 변수는 사용할 수 없음.
		
		int num1 = 10; // 타입 변수명 = 값 ;
		System.out.println(num1);
		{
			int num2 = 20;
			System.out.println(num1);
			System.out.println(num2);
		}
//		System.out.println(num2);  // 범위를 벗어나서 Exception
		
		// java에서 error (프로그램(코드)적으로 손댈 수 없는 에러)
		// Exception 프로그램적으로 발생할 수 있는 에러(내가 코드를 잘못 짠 경우)
		
		// char : 한글자만 저장 가능. ' ' 작은따옴표 사용.
		// String : 단어 장문 가능. " " 큰따옴표 사용.
		char ch = 'a';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		// long / float L / F 를 접미사로 표현
		// java 정수의 기본자료형 int 실수의 기본자료형 double
		
		long l = 1234567; // long 형의 특징
		System.out.println(l);
		
		float f = 0.112547f;
		System.out.println(f);
		
		// 사칙연산자 : + - * / %(나머지)
		// 증감연산자 : ++ --
		// 논리연산자 : &&, || !
		// 대입연산자 : = /같다 == /같지않다 !=
		// 조건선택 연산자 : (조건식)? true:false 연결해서 다중사용 가능.
		// + : 산술연산자, 연결연산자도 가능
		// 숫자 + 숫자 => 산술연산자
		// 숫자 + 문자 => 연결연산자로 인지 이후부터 문자로 인식
		System.out.println("1" + "+" + "2" + "=" + (1+2) );
	}

}
