package day01;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 5자리 숫자 입력받아서 각 자리의 합 출력
		// 입력값 : 12345, 출력값 : 1+2+3+4+5
		String s = sc.nextLine();
		String[] arr = s.split("");
		int sum1 = 0;
		int sum2 = 0;
		
		
		System.out.println("orderByAsc");
		for(int i=0; i<arr.length; i++) {
			if (i == 0) {
				sum1 += Integer.parseInt(arr[i]);
			}
			else if(i != arr.length && i != 0) {
				sum1 += Integer.parseInt(arr[i]);
				System.out.print(" + ");
			} else {
				break;
			}
			System.out.print(arr[i]);
		}
		System.out.println(" = " + sum1);
		
		System.out.println("orderByDesc");
		for(int j=arr.length-1; j>=0; j--) {
			if (j == arr.length-1) {
				sum2 += Integer.parseInt(arr[j]);
			}
			else if(j != arr.length && j != arr.length-1) {
				sum2 += Integer.parseInt(arr[j]);
				System.out.print(" + ");
			} else {
				break;
			}
			System.out.print(arr[j]);
		}
		System.out.println(" = " + sum2);
	}

}
