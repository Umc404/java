package day02;

import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int menu = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
			/* 계산기 만들기
			 * --menu--
			 * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.나머지 6.종료
			 * > 메뉴선택 1
			 * > 숫자입력 1 5
			 * 결과 : 1 + 5 = 6
			 * (더하기 메서드를 호출하여 연산결과를 출력)
			 * 4,5번은 두번째 숫자가 0이면 '0으로 나눌 수 없습니다'
			 * */
			MethodEx02 calc = new MethodEx02();

			do {
				System.out.println("--menu--");
				System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.나머지 6.종료");
				
				System.out.print("> 메뉴 선택 : ");
				menu = sc.nextInt();
				
				System.out.print("> 숫자입력 : ");
				a = sc.nextInt();
				b = sc.nextInt();
				
				switch(menu) {
				case 1:
					System.out.println("덧셈 선택");
					result = calc.plus(a,b);
					System.out.println("결과 : "+ a + " + " + b + " = " + result);
					break;
				case 2:
					System.out.println("뺄셈 선택");
					result = calc.minus(a,b);
					System.out.println("결과 : "+ a + " - " + b + " = " + result);
					break;
				case 3:
					System.out.println("곱셈 선택");
					if (b == 0) {
						System.out.println("0으로 나눌 수 없습니다.");
					} else {
						result = calc.mul(a,b);
					}
					System.out.println("결과 : "+ a + " * " + b + " = " + result);
					break;
				case 4:
					System.out.println("나눗셈 선택");
					if (b == 0) {
						System.out.println("0으로 나눌 수 없습니다.");
					} else {
						result = calc.div(a,b);
					}
					System.out.println("결과 : "+ a + " / " + b + " = " + result);
					break;
				case 5:
					System.out.println("나머지 선택");
					if (b == 0) {
						System.out.println("0으로 나눌 수 없습니다.");
					} else {
						result = calc.els(a,b);
					}
					System.out.println("입력받은 값 : " + a +", "+ b); 
					System.out.println("결과 : "+ a + " % " + b + " = " + result);
					break;
				case 6:
					System.out.println("계산 종료합니다.");
					break;
				default:
					System.out.println("잘못 입력하셨으요.");
					break;
				}
			} while(menu < 6);
//				System.out.println("종료");
				
		sc.close();
	}
	public int plus(int num1, int num2) { // 1
		return num1 + num2;
	}
	public int minus(int num1, int num2) { // 2
		return num1 - num2;
	}
	public int mul(int num1, int num2) { // 3
		return num1 * num2;
	}
	public int div(int num1, int num2) { // 4
		return num1 / num2;
	}
	public int els(int num1, int num2) { // 5
		return num1 % num2;
	}
}
