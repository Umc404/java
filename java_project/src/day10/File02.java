package day10;

import java.io.IOException;

public class File02 {

	public static void main(String[] args) {
		// System.in 을 이용하여 알파벳 받기
		
		System.out.println("알파벳 입력 >");
		try {
			int in = System.in.read();
			if(in != '\n') {
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
