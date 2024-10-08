package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx03 {

	public static void main(String[] args) {
		/* num 값을 숫자 List 생성하여 추가 => 출력
		 * 합계 출력
		 * 70점 이상인 인원 수 출력
		 * 3/8 명
		 * */
		
		String num = "45,78,98,65,84,54,64,31";
		
		String numArr[] = num.split(",");					// "," 기준으로 문자 잘라 배열에 저장.
		int gradeArr[] = new int[numArr.length];			// 정수로 바꿔넣을 배열 생성.
		
		
		for(int i=0; i<gradeArr.length; i++) {				// 정수로 바꿔서 gradeArr에 넣기
			gradeArr[i] = Integer.parseInt(numArr[i]);
		}
		
		for(int i=0; i<gradeArr.length; i++) {				// 잘 들어갔는지 테스트.
			System.out.print(gradeArr[i] + " ");
		}
		System.out.println();
		
		List<Integer> gradeList = new ArrayList<>();		// list 선언.
		for(int i=0; i<gradeArr.length; i++) {				// list 에 반복문 돌려 값 집어넣기.
			gradeList.add(gradeArr[i]);
		}
		
		System.out.println(gradeList);						// 잘 들어갔는지 테스트
		
		// 합계
		int sum = 0;
		for(Integer tmp : gradeList) {						// 반복문 돌려 sum에 값 모두 더하기. 
			sum += tmp;
		}
		System.out.println("총 점수 합계 : "+ sum);			// 출력
		
		// 70점 이상인 인원
		int pass = 0;
		for(Integer tmp : gradeList) {						// 반복문 : 70점 이상인 값일 경우
			if(tmp >= 70) {
				pass++;										// 조건 맞으면 pass++
			}
		}
		System.out.println(pass + "/" + gradeList.size() + "명");
	}

}
