package day01;

public class Test02 {
	public static void main(String[] args) {
		/* 국어 영어 수학 세 점수의 합계와 평균을 출력
		 * if 문 이용하여 평균 80점 이상이면 pass / fail*/
		int kor = 70;
		int eng = 87;
		int math = 89;
		
		int sum = kor + eng + math;
		double avg = sum/3;
		String s = "";
		
		if (avg >= 80 ) {
			s = "pass";
		}
		else {
			s = "fail";
		}
		
		System.out.printf("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("결과 : " + s);
	}
}
