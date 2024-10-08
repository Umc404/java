package day07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception05 {

	public static void main(String[] args) {
		// I/O Exception 발생 예제
		InputStreamReader isr = new InputStreamReader(System.in);
		// System.in : 콘솔에서 입력받음
		// System.out : 콘솔에서 출력함
		BufferedReader br = new BufferedReader(isr);
		
		String name;
		try {
			name = br.readLine();
			System.out.println(name);
			br.close();
			isr.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
