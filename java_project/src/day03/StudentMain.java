package day03;

import java.util.jar.Attributes.Name;

public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student("incheon","park","AWS","010-1111-4444");
		Student st2 = new Student("seoul","kim","JAVA","010-1111-6666");
		Student st3 = new Student("seoul","jung","AWS","010-1111-2222");
		Student st4 = new Student("incheon","lee","JAVA","010-1111-7777");
		Student st5 = new Student("incheon","choi","AWS","010-1111-5555");
		Student st6 = new Student("seoul","choi","JAVA","010-1111-3333");
		
		Student[] studentArr = new Student[6];
		
		studentArr[0] = st1;
		studentArr[1] = st2;
		studentArr[2] = st3;
		studentArr[3] = st4;
		studentArr[4] = st5;
		studentArr[5] = st6;
		
//		for(int i=0; i<studentArr.length; i++) {
//			System.out.println(studentArr[i]);
//		}
//		
//		System.out.println();
//		
		for(Student stemp : studentArr) {
			System.out.println(stemp);
		}
		
		System.out.println("-------------------------1");
		// 특정 데이터 정보를 출력
		// equals : String 값이 같은지 확인하는 메서드
		String searchName = "choi";
		for(Student st : studentArr) {
			if(st.getName().equals(searchName)) {
				System.out.println(st);
			}
		}
		System.out.println("-------------------------");
		// incheon 지점 학생들 명단 출력
		// 없다면 명단이 없습니다 출력
		String searchState = "incheon";
		int cnt = 0;
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getState().equals(searchState)) {
				System.out.println(studentArr[i]);
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println("명단이 없습니다.");
		}
		System.out.println("-------------------------");
		// 홍길동의 그룹이 AWS로 변경 => 출력 // incheon lee,  course => aws
		String searchName2 = "lee";
		for(Student st : studentArr) {
			if(st.getName().equals(searchName2)) {
				st.setCourse("AWS");
				System.out.println(st);
			}
		}
//		System.out.println(st1); // toString 자동호출. 없으면 주소 자동호출
//		System.out.println(st2);
//		st1.print();
//		st2.print();
		
	}

}
