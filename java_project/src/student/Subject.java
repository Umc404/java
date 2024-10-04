package student;

public class Subject {
	// subject
	private String subCode, subName, subProName, subTimetable, subState;
	private int subPoint, subTime;
	// index
	private int cnt = 0; // ?
	
	// 멤버변수 / 생성자 / getter/setter / toString(수강정보)
	
	public Subject() {}
	
	public Subject(String subCode, String subName) {
//		, int subPoint, int subTime, String subProName, String subTimetable, String subState) {
//	}
		this.subCode = subCode;
		this.subName = subName;
//		this.subPoint = subPoint;
//		this.subTime = subTime;
//		this.subProName = subProName;
//		this.subTimetable = subTimetable;
//		this.subState = subState;
	}
	
	public void registSubject(String subCode, String subName, int subPoint, int subTime, String subProName, String subTimetable, String subState) {
		this.subCode = subCode;
		this.subName = subName;
		this.subPoint = subPoint;
		this.subTime = subTime;
		this.subProName = subProName;
		this.subTimetable = subTimetable;
		this.subState = subState;
	}
	
	
	
	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName+ "]";
	}

	// getter / setter
	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getSubProName() {
		return subProName;
	}

	public void setSubProName(String subProName) {
		this.subProName = subProName;
	}

	public String getSubTimetable() {
		return subTimetable;
	}

	public void setSubTimetable(String subTimetable) {
		this.subTimetable = subTimetable;
	}

	public String getSubState() {
		return subState;
	}

	public void setSubState(String subState) {
		this.subState = subState;
	}

	public int getSubPoint() {
		return subPoint;
	}

	public void setSubPoint(int subPoint) {
		this.subPoint = subPoint;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
