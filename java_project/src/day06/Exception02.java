package day06;

import java.util.Scanner;


public class Exception02 {

	public static void main(String[] args) {
		// ArithmeticException : 0으로 나누었을 때 발생하는 Exception
		// 1 2 + 1 2 - 1 2 * 1 0 / 1 0 %
		Exception02 ex02 = new Exception02();
		
//		calc ca = new calc();
		Scanner sc = new Scanner(System.in);
		int a, b;
		double res = 0;
		char op;
		
		System.out.println("수 두개를 입력하세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		System.out.println("등호를 입력하세요");
		op = sc.next().charAt(0);
		try {
			System.out.println(ex02.calc(a, b, op));
		} catch (Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
//		try {
//			switch(op) {
//			case '+': res = a + b; break;
//			case '-': res = a - b; break;
//			case '*': res = a * b; break;
//			case '/': res = a / b; break;
//			case '%': res = a % b; break;
//			default:
//				System.out.println("등호를 입력하세요.");
//			}
//			System.out.println("입력값 : " + a +", "+ b +", "+ op);
//			System.out.println("결과 :"+ res);
//		} catch(Exception e) {
//			System.out.println("0으로 나누면 안돼요;");
//		}
		sc.close();
	}
	// 두 수를 입력받고, 연산자를 입력받아 사칙연산의 결과를 리턴하는 메서드
	// int num1, int num2, char op
	// return Type : double
	public double calc(int num1, int num2, char op) {
		double res = 0;
		
		if((op == '/' || op == '%') && num2 == 0) {
			throw new RuntimeException("두번째 입력한 게 0이에요;");
		}
		
		switch(op) {
			case '+': res = num1 + num2; break;
			case '-': res = num1 - num2; break;
			case '*': res = num1 * num2; break;
			case '/': res = num1 / num2; break;
			case '%': res = num1 % num2; break;
			default:
				throw new RuntimeException(op + "이상한거 말고 등호를 입력하세요.");
		}
		return res;
	}
}
