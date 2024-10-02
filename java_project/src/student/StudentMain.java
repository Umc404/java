package student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// 메뉴처리
		// 1. 학생 등록 | 2. 학생 리스트 출력(학생들만) | 3. 학생 검색(학생정보, 수강정보) | 4.학생정보 수정
		// 5. 학생 삭제 | 6. 수강신청 | 7. 수강 철회(삭제) | 8. 종료
		// 6 : 학생 검색받게 처리
		// 7 : 학생, 수강 검색받게 처리
		
		StudentController ctrl = new StudentController();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		// 호출
		
		do {
			System.out.println("1. 학생 등록 | 2. 학생 리스트 출력 | 3. 학생 검색(학생정보, 수강정보) | 4.학생정보 수정");
			System.out.println("5. 학생 삭제 | 6. 수강신청 | 7. 수강 철회(삭제) | 8. 종료");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				ctrl.insertStudent(sc);
				break;
			case 2:
				ctrl.printStudent();
				break;
			case 3:
				ctrl.searchStudent(sc);
				break;
			case 4:
				ctrl.modifyStudent(sc);
				break;
			case 5:
				ctrl.deleteStudent(sc);
				break;
			case 6:
				ctrl.registSubject(sc);
				break;
			case 7:
				ctrl.deleteSubject(sc);
				break;
			case 8:
				System.out.println("종료");
				break;
			default: System.out.println("잘못 입력했습니다.");
			}
		} while(menu != 8);
		
		sc.close();
	}

}
