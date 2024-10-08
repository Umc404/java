package day04;

import java.util.Arrays;

/* - 학생 정보를 관리하기 위한 클래스
 * - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
 * - 학원정보 : 학원명="EZEN" (final static), 지점
 * - 수강정보 : 수강과목[], 기간[]
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
 */

public class Student {
	private String name, birthDate, telNum;
	int age;
	private final static String AC = "EZEN";
	private String state;
	private String[] course = new String[5];
	private String[] period = new String[5];
//	private String courseName, coursePer; // array 처리
	// index 처리용 변수;
	private int cnt;
	
	// 생성자
	public Student() {};

	public Student(String name, String birthDate, String telNum, int age) {
		// 학생정보만
		this.name=name;
		this.birthDate =birthDate;
		this.telNum = telNum;
		this.age = age;
	}
	public Student(String name,String telNum, String state) {
		// 학생정보만
		this.name=name;
		this.telNum = telNum;
		this.state = state;
	}
	public Student(String name, String birthDate, String telNum, int age, String state) {
		this(name, birthDate, telNum, age);
		this.state = state;
	}
	
	
	public Student(String state) {
		this.state = state;
	}
	// 메서드
	public void studentInfo() {
//		System.out.println("--------학생정보--------");
		System.out.println(name+"("+birthDate+") "+telNum+" / "+age);
	}
	public void stateInfo() {
		System.out.println(AC+"("+state+")");
	}
	public void courseInfo() {
		if(course.length==0 || cnt== 0) {
			System.out.println("수강과목이 없습니다");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println(course[i]+"("+period[i]+") ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", birthDate=" + birthDate + ", telNum=" + telNum + ", age=" + age + ", state="
				+ state + ", course=" + Arrays.toString(course) + ", period=" + Arrays.toString(period) + ", cnt=" + cnt
				+ "]";
	}

	// 수강등록
	// insertCourse()
	// 매개변수 : 등록하고자 하는 course, period
	// 리턴타입 : 배열에 데이터 추가(리턴값은 없음.) void
	public void insertCourse(String course, String period) {
		// cnt = 0 인 상황. 하나도 추가 안됨
		if(cnt >=5) {
			System.out.println("더이상 수강할 수 없습니다.");
			// 배열을 늘려 더 많은 수강을 받을 수 있음. (배열 복사)
			return;
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}
	
	public String getAc() {
		return AC;
	}
	
}
