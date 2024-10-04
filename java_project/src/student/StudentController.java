package student;

import java.util.Scanner;

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

public class StudentController implements Program {
	// 멤버변수 추가
	// student
	private String studNo, name, telNum, addr;
	private int age;
	
	private Student[] std = new Student[10];
	private int stdCnt = 0;
	
	@Override
	public void insertStudent(Scanner scan) {
		
		System.out.println("학번 >");
		studNo = scan.next();
		System.out.println("이름 >");
		name = scan.next();
		System.out.println("나이 >");
		age = scan.nextInt();
		System.out.println("연락처 >");
		telNum = scan.next();
		System.out.println("주소 >");
		addr = scan.next();
		
		Student info = new Student();
		info.insertStudent(studNo, name, age, telNum, addr);
		
		
		std[stdCnt] = info;
		stdCnt++;
	}

	
	
	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		for(Student list : std) {
			if(list != null) {
				list.studentInfo(); // 개인 코딩결과 출력
//				System.out.println(list); // toString
			}
		}
	}
	
	@Override
	public int searchStudent(Scanner scan) {
		
		System.out.println("학생의 이름 또는 학번을 작성하세요.");
		String searchText = scan.next();
		
		for(int i=0; i<std.length; i++) {
			if(std[i] != null) { 								// nullException 방지
				if(std[i].getName().equals(searchText)) {
					std[i].studentInfo();
					// 수강리스트 추가해야함.
					std[i].subPrint();
					return i;
				}
				else if(std[i].getStudNo().equals(searchText)) {
					std[i].studentInfo();
					// 수강리스트 추가해야함.
					std[i].subPrint();
					return i;
				}
			}
		}
		System.out.println("입력한 학생의 정보가 없습니다.");
		return -1;
	}

	@Override
	public void modifyStudent(Scanner scan) {
		System.out.println("수정할 학생의 이름을 작성하세요.");
		String searchText = scan.next();
		String modText;
		for(int i=0; i<std.length; i++) {
			if(std[i] != null) {  								// nullException 방지
				if(std[i].getName().equals(searchText)) {
					System.out.println("수정할 항목을 입력하세요. A : 학번 | B : 이름 | C : 나이 | D : 연락처 | E : 주소");
					char cate = scan.next().charAt(0);
					switch(cate) {
					case 'A':
						System.out.println("학번 : 수정사항을 입력하세요.");
						modText = scan.next();
						std[i].setStudNo(modText);
						break;
					case 'B':
						System.out.println("이름 : 수정사항을 입력하세요.");
						modText = scan.next();
						std[i].setName(modText);
						break;
					case 'C':
						System.out.println("나이 : 수정사항을 입력하세요.");
						modText = scan.next();
						std[i].setAge(Integer.parseInt(modText));
						// Integer.parseInt(searchText);
						break;
					case 'D':
						System.out.println("연락처 : 수정사항을 입력하세요.");
						modText = scan.next();
						std[i].setTelNum(modText);
						break;
					case 'E':
						System.out.println("주소 : 수정사항을 입력하세요.");
						modText = scan.next();
						std[i].setAddr(modText);
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
					}
				} 
			}
		}
		System.out.println("수정 완료.");
	}

	@Override
	public void deleteStudent(Scanner scan) {
		System.out.println("삭제할 학생의 이름을 입력하세요.");

		String delText = scan.next();
		int index = -1;

		for(int i=0; i<stdCnt; i++) {

			if(std[i].getName().equals(delText)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("일치한 학생이 없습니다.");
		}

		int copyCnt = std.length - index - 1;
		System.arraycopy(std, index+1, std, index, copyCnt);

		std[stdCnt-1] = null;
		stdCnt--;

		printStudent();
		
	}

	@Override
	public void registSubject(Scanner scan) {
		// 누가 어떤 과목을 수강할 지를 받아야 함.
		// 수강신청 학번을 먼저 검색 후 추가
//		System.out.println("학생의 이름 또는 학번을 작성하세요.");
//		for(int i=0; i<std.length; i++) {
//			if(std[i] != null) { 								// nullException 방지
//				if(std[i].getName().contains(searchText)) {
//					std[i].studentInfo();
//					// 수강리스트 추가해야함.
//					std[i].subPrint();
//				}
//				else if(std[i].getStudNo().contains(searchText)) {
//					std[i].studentInfo();
//					// 수강리스트 추가해야함.
//					std[i].subPrint();
//				}
//			}
//		}
		int index = searchStudent(scan);
		System.out.println("--------------");
		System.out.println("등록할 수강의 과목코드 >");
		String subCode = scan.next();
		System.out.println("등록할 수강의 과목이름 >");
		String subName = scan.next();
		// 
		Subject sub = new Subject(subCode, subName);
		std[index].registSubject(sub);
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		int index = searchStudent(scan);
		if (std[index].getCnt() != 0) {
			System.out.println("--------------");
			System.out.println("철회할 수강의 과목코드 >");
			String subCode = scan.next();
			std[index].deleteSubject(subCode);
			System.out.println(subCode + " 과목 수강철회 완료");
		}
	}

}
