package day02;
import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		// 정수 하나를 주면
		// 구구단을 출력하는 메서드
		int x = 0;
		Method03 m3 = new Method03();
		
		Scanner sc = new Scanner(System.in);
			System.out.println("출력할 구구단을 입력하세요.");
			x = sc.nextInt();
			m3.div9(x);
		sc.close();
	}
	public void div9(int a) {
		for(int i=1; i<10; i++) {
			System.out.println(a+" * "+i+" = "+ a*i);
		}
	}
}
