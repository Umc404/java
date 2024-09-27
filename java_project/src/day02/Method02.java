package day02;

//import java.util.Scanner;

public class Method02 {

	public static void main(String[] args) {

		Method02 calc = new Method02();
		
		System.out.println(calc.plus(100, 100));
		System.out.println(calc.minus(100, 10));
		System.out.println(calc.mul(100, 100));
		System.out.println(calc.disc(100, 0));
		System.out.println(calc.mod(100, 100));
		// div, mod => 나누는 값이 num2가 0이면 Exception 발생
		// return 타입이 double Infinity
		// method에서 return 은 메서드의 종료를 알림.
		
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
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}else {
			return num1 / num2;
		}
	}
	public int mod(int num1, int num2) {
		if(num2 <= 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}else {
			return num1 % num2;
		}
	
	}
}
