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
//import java.util.Scanner;

public class Student {
	
	// 학번, 이름, 나이, 전화번호, 주소, 수강과목들
	// 멤버변수 / 생성자 / getter / setter / toString(학생정보)
	// 수강신청 / 수강철회 / 수강과목 출력 - 여기다 해야함. subject 아님
	
	// student
	private String studNo, name, telNum, addr;
	private int age;
	// solve : subject
	private Subject[] subjectList = new Subject[5];
	
	private int cnt; // 배열 카운트(subject)
	
	// 생성자
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
	// sol : subPrint() - 수강과목 프린트
	public int subPrint() {
		if(cnt==0) {
			System.out.println("수강과목이 없습니다.");
			return -1;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println(subjectList[i]); // toString 호출
		}
		return 1;
	}
	// 수강신청 메서드 : subjectList subject 객체 생성 후 추가
	public void registSubject(Subject sub) {
		// 배열 차면 늘려주기
		if(cnt == subjectList.length) {
			Subject[] tmp = new Subject[subjectList.length+5];
			// 배열 복사
			System.arraycopy(subjectList, 0, tmp, 0, cnt);
			// 기존 배열 변경
			subjectList = tmp;
		}
		
		subjectList[cnt] = sub;
		cnt++;
	}
	// 수강삭제 메서드.
	// 수강코드 값을 매개변수로 받아서 삭제.
	public void deleteSubject(String subCode) {
		// 삭제할 코드의 위치 값을 저장하는 변수
		int index = -1;
		if(subCode == null) {
			return;
		}
		for(int i=0; i<cnt; i++) {
			if(subjectList[i].getSubCode().equals(subCode)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		// 삭제 : 찾은 위치부터 뒷번지를 앞번지로 옮기는 작업
		
		int copyCnt = subjectList.length - index - 1;
		System.arraycopy(subjectList, index+1, subjectList, index, copyCnt);
		// 위, 아래 둘 중 하나 사용
//		for(int i=index; i<cnt-1; i++) {
//			subjectList[i] = subjectList[i+1];
//		}
		
		subjectList[cnt-1] = null;
		cnt--;
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

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	
}
