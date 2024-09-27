package day03;

public class PrintStudent {

	public static void main(String[] args) {
		
		Student st1 = new Student("인천","엄기빈");
		Student st2 = new Student("인천","엄기빈","AWS Backend","01022508322");

		st1.print();
		st2.print();
	}

}
class Student {
	private String state, name, course, telnum;
	
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
	public void print() {
		System.out.println("지점 : " + state);
		System.out.println("이름 : " + name);
		System.out.println("과정 : " + course);
		System.out.println("전화번호 : " + telnum);
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