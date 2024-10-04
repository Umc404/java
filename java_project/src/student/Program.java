package student;

import java.util.Scanner;

public interface Program {
	// 1. 학생 등록 | 2. 학생 리스트 출력 | 3. 학생 검색(학생정보, 수강정보) | 4.학생정보 수정
	// 5. 학생 삭제 | 6. 수강신청 | 7. 수강 철회(삭제) | 8. 종료
	
	void insertStudent(Scanner scan);
	void printStudent();
	int searchStudent(Scanner scan);
	void modifyStudent(Scanner scan);
	void deleteStudent(Scanner scan);
	void registSubject(Scanner scan);
	void deleteSubject(Scanner scan);
}
