package student;


/* -- 학생 --
 * 학번 : studNo
 * 이름 : name
 * 나이 : age
 * 전화번호 : telNum
 * 주소 : addr
 * 수강과목들(배열) : subject
 * 
 * -- 과목 --
 * 과목코드 : subCode
 * 과목명 : subName
 * 학점 : subPoint
 * 시수 : subTime
 * 교수명 : subProName
 * 시간표 : subTimetable
 * 강의장 : subState
 * */

public class Student {
	
	// student
	private String studNo, name, telNum, addr;
	private int age;
	
	public Student() {};
	
	public Student(String studNo, String name, int age, String telNum, String addr) {
		this.studNo = studNo;
		this.name = name;
		this.age = age;
		this.telNum = telNum;
		this.addr = addr;
	}
	public void insertStudent(String studNo, String name, int age, String telNum, String addr) {
		this.studNo = studNo;
		this.name = name;
		this.age = age;
		this.telNum = telNum;
		this.addr = addr;
	}
	public void studentInfo() {
		System.out.println("학번 : " + studNo);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("연락처 : " + telNum);
		System.out.println("주소 : " + addr);
	}
	
	@Override
	public String toString() {
		return "Student [studNo=" + studNo + ", name=" + name + ", telNum=" + telNum + ", addr=" + addr + ", age=" + age
				+ "]";
	}

	// getter / setter
	public String getStudNo() {
		return studNo;
	}

	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
