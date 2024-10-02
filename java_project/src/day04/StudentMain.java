package day04;


/* - 학생 정보를 관리하기 위한 클래스
 * - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
 * - 학원정보 : 학원명="EZEN" (final static), 지점
 * - 수강정보 : 수강과목, 기간
 * => 여러과목을 들을 수 있음.(여러과목을 수강하기 위해서는 배열로 처리. 5과목까지 가능)
 * 
 * ex) 홍길동(010101) 010-1111-1111 / 25 -> 학생정보
 * EZEN(인천) -> 학원정보
 * 자바 6개월, 파이썬 1개월, SQLD 1개월 -> 수강정보
 * 
 * 기능(메서드)
 * - 학생의 기본정보 출력기능
 * - 학원 정보를 출력하는 기능
 * - 학생이 수강정보를 추가하는 기능 : 배열에 추가기능
 * 
 * 4 : name, birthDate, telNum, age
 * 5 : name, birthDate, telNum, age, state
 * 1 : state
 * 2 : coureName, coursePer
 */
public class StudentMain {

	public static void main(String[] args) {

		Student st = new Student();
		
		st.setName("umc");
		st.setTelNum("010-1111-1111");
		st.setBirthDate("950404");
		st.setAge(30);
		st.setState("인천");
//		st.studentInfo();
//		st.stateInfo();
//		st.courseInfo();
		
		Student st1 = new Student("lee","981107","010-2222-2222",27,"seoul");
		
		Student st2 = new Student("kim","941001","010-3333-3333",31,"incheon");
		Student st3 = new Student("lee","980930","010-4444-4444",26,"seoul");
		Student st4 = new Student("park","020501","010-5555-5555",23,"seoul");
		Student st5 = new Student("hong","051201","010-6666-6666",20,"incheon");
		Student st6 = new Student("kim","991230","010-7777-7777",26,"incheon");
		Student st7 = new Student("hong","970725","010-8888-8888",28,"seoul");
		
//		st.insertCourse("JS", "2 month");
//		st.insertCourse("Java", "3 month");
//		
//		st1.insertCourse("python", "4 month");
//		st1.insertCourse("AWS", "2 month");
//		
//		st2.insertCourse("MySQL", "2 month");
//		st2.insertCourse("python", "2 month");
//		st2.insertCourse("JS", "2 month");
//		st2.insertCourse("React", "2 month");
//		
//		st3.insertCourse("python", "1 month");
//		st3.insertCourse("Oracle", "3 month");
//		
//		st4.insertCourse("HTML", "3 month");
//		st4.insertCourse("Java", "2 month");
//		st4.insertCourse("python", "4 month");
//		st4.insertCourse("AWS", "2 month");
//		
//		st5.insertCourse("JS", "1 month");
//		st5.insertCourse("AWS", "2 month");
//		
//		st6.insertCourse("MySQL", "2 month");
//		st6.insertCourse("python", "2 month");
//		st6.insertCourse("AWS", "2 month");
		
//		st7.insertCourse("MySQL", "2 month");
//		st7.insertCourse("python", "2 month");
//		st7.insertCourse("HTML", "3 month");
//		st7.insertCourse("Node", "2 month");
//		st7.insertCourse("Jsp", "2 month");
		
		Student[] std = new Student[8];
		
		std[0] = st;
		std[1] = st1;
		std[2] = st2;
		std[3] = st3;
		std[4] = st4;
		std[5] = st5;
		std[6] = st6;
		std[7] = st7;
		
		for(Student list : std) {  // 싹다 출력
			System.out.println(list);;
		}
		// 학생 전체명단 출력(학생 정보만)
		System.out.println("-------- 학생정보 --------");
		for(Student list : std) {
			list.studentInfo();
		}
		
		// hong 학생의 학생정보 학원정보 수강 출력
		System.out.println("-------- hong 수강정보 --------");
		for(Student list : std) {
			if(list.getName().equals("hong")) {
//				System.out.println(list);
				list.studentInfo();
				list.courseInfo();
			}
		}
		// incheon 지점의 학생명단 (학생 정보만)
		System.out.println("-------- incheon 지점 학생명단 --------");
		for(int i=0; i<std.length; i++) {
			if(std[i].getState() != null) {
				if(std[i].getState().equals("incheon")) {
					std[i].studentInfo();
				}
			}
		}
		// Java 과목을 수강하는 학생명단 출력. (학생정보 학원정보 수강정보 전부 출력)
		System.out.println("-------- Java 과목 수강명단 --------");
		for(Student list : std) {
			for(int i=0; i<list.getCourse().length; i++) {
				if(list.getCourse()[i] != null) {
					if(list.getCourse()[i].equals("Java")) {
						list.studentInfo();
						list.stateInfo();
						list.courseInfo();
					}
				}
			}
		}
		// 수강하지 않는 학생 명단 출력 (학생 정보만)
		System.out.println("-------- 수강하지 않는 학생명단 --------");
		for(Student list : std) {
			if(list.getCourse()[0] == null ) {
				list.studentInfo();
				return;
			}
		}
	}

}
