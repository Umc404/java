package word1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* 단어장 프로그램
		 * Word class 생성
		 *  1. 단어 등록 | 2.단어 검색 | 3. 단어 수정 | 4. 단어 출력 | 5. 단어 삭제 | 6. 단어파일로 출력 | 7. 종료
		 * - 단어 뜻 list > List<String> = new ArrayList<>()
		 * 
		 * Word(equals 사용) : 단어가 같으면 같은 객체
		 * txt 파일로 저장
		 */
		
//		FileWriter fw = new FileWriter("writer1.txt");
//		for(int i=0; i<=10; i++) {
//			String data = i+"test \r\n";		// \r : 캐리지 리턴. 커서를 행의 앞으로 이동. 잘 사용하진 않음.
//			fw.write(data);						// 파일에 기록
//			fw.write("my project I/O Test \r\n");
//		}
//		fw.close();
		
		
		/* 집에서 해볼거
		 * 1. word / wordController 분리
		 * 2. 뜻 입력 여려개 받을 수 있도록. 입력받을 때 e 입력받으면 종료.
		 * 3. 콘솔에 저장한 리스트들 6번에서만 저장하고 출력하도록. (현재 4,6 번 제외하고 리스트 txt 파일에 갱신상태.)
		 */
		
		Word word = new Word();
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("1. 단어 등록 | 2. 단어 검색 | 3. 단어 수정 | 4. 단어 출력");
			System.out.println("5. 단어 삭제 | 6. 단어파일로 출력 | 7. 종료");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				word.insertWord(sc);
				break;
			case 2:
				word.searchWord(sc);
				break;
			case 3:
				word.updateWord(sc);
				break;
			case 4:
				word.printWord();
				break;
			case 5:
				word.deleteWord(sc);
				break;
			case 6:
				word.txtPrintWord();
				break;
			case 7:
				System.out.println("종료합니다.");
				break;
			}
		} while(menu < 7);
		
		
		
		
		
		sc.close();
		
	}

}
