package day03;


/* 객체를 생성 시 값을 초기화하는 방법
 * 기본값, 명시적 초기값, 초기화 블럭
 * 1. 기본값 : 기본적으로 지정되는 값 int = 0 / String = null
 * 2. 명시적 초기값 : 사용자가 멤버변수를 선언함과 동시에 값을 지정
 * 3. 초기화 블럭 : {} 멤버변수들의 초기화
 * 4. 생성자 : 객체 생성 시 초기화를 해서 생성
 * 
 * 초기값의 우선순위(순위가 높은 값으로 덮어쓰여짐)
 * 기본값 -> 명시적 초기값 -> 생성자(가장 우선순위가 높음)
 */




public class Student {
	private String state, name, course, telnum;
	
	{
		name = "student";
		course = "JAVA";
	}
	public Student() {
		this.state ="서울";
	};
	
	public Student(String state, String name) {
		this.state = state;
		this.name = name;
	}
	public Student(String state, String name, String course, String telnum) {
		this(state, name);
		this.course = course;
		this.telnum = telnum;
	}
	
	// 객체의 내용을 출력하는 메서드
	public void print() {
		System.out.println("지점 : " + state);
		System.out.println("이름 : " + name);
		System.out.println("과정 : " + course);
		System.out.println("전화번호 : " + telnum);
	}
	// @Override : 어노테이션(애너테이션) => 작은 기능이 있는 정의어
	// override(오버라이드) : 부모의 메서드를 자식이 가져와서 재정의 하는 기능. 
	// getter / setter, toString => 자동생성해줌.
	@Override
	public String toString() {
		return "Student [state=" + state + ", name=" + name + ", course=" + course + ", telnum=" + telnum + "]";
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTelnum() {
		return telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
}