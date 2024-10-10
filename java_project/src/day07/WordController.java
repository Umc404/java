package day07;

import java.util.HashMap;
import java.util.Scanner;

// 1. 단어 등록 | 2.단어 검색 | 3. 단어 수정 | 4. 단어 출력 | 5. 단어 삭제 | 6. 종료

public class WordController {
	
	HashMap<String, String> wordList = new HashMap<>();	
	String word, mean;
	
	public void insertWord() {
		wordList.put("pear", "배");
		wordList.put("apple", "사과");
		wordList.put("orange", "오렌지");
	}
	
	public void insertWord(Scanner scan) {
		System.out.println("등록할 단어를 입력하세요. (단어, 뜻)");
		word = scan.next();
		mean = scan.next();
		
		wordList.put(word, mean);
		System.out.println("단어등록 완료.");
	}

	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어를 입력하세요.");
		String searchWord = scan.next();
		
		if(wordList.containsKey(searchWord)) {
			System.out.println(searchWord + "" + wordList.get(searchWord));
			return;
		}
		System.out.println("검색결과가 없습니다.");
	}

	public void modifyWord(Scanner scan) {
		System.out.println("수정할 단어를 입력하세요.");
		String modifyWord = scan.next();
		
		if(wordList.remove(modifyWord) == null) {
			System.out.println("수정단어가 없습니다.");
			return;
		}
		System.out.println("수정사항 입력");
		String modifyMean = scan.next();
		wordList.put(modifyWord, modifyMean);
		System.out.println("수정 완료");
	}

	public void printWord() {
		for(String s : wordList.keySet()) {
			System.out.println(s + " : " + wordList.get(s));
		}
	}

	public void deleteWord(Scanner scan) {
		System.out.println("삭제할 단어를 입력하세요.");
		String deleteWord = scan.next();
		
		if(wordList.containsKey(deleteWord)) {
			wordList.remove(deleteWord);
			System.out.println("단어 삭제 완료.");
			return;
		}
		System.out.println("검색결과가 없습니다.");
	}
	
}
