package word2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordController {
	
	List<Word> list = new ArrayList<>();
	private String word, mean;
	
	public void insertWord(Scanner sc) /*throws IOException*/ {
		System.out.println("단어 입력 : ");
		word = sc.next();
		
		mean = "";
		List<String> meanList = new ArrayList<>();
		
		while(!mean.equals("x")) {
			System.out.println("뜻 입력 : (\"x\" 입력 시 종료)");
			mean = sc.next();
			if(mean.equals("x")) {
				break;
			} else {
				meanList.add(mean);
			}
		}
			
		list.add(new Word(word, meanList));
		
//		FileWriter fw = new FileWriter("word.txt");
//		for(Word tmp : list) {
//			String wordInfo = "단어 : " + tmp.getWord() + "\t뜻 : " + tmp.getMean() +"\r\n";
//			fw.write(wordInfo);
//		}
//		fw.close();
		System.out.println("등록 완료.");
	}

	public void searchWord(Scanner sc) {
		System.out.println("검색할 단어를 입력하세요.");
		int res = -1;
		String srWord = sc.next();
		
		for(Word tmp : list) {
			if(tmp.getWord().equals(srWord)) {
				System.out.println(tmp.getWord() +" : " + tmp.getMean());
				res = 1;
			}
		}
		if(res == -1) {
			System.out.println("검색결과 없음.");
		}
		
	}

	public void updateWord(Scanner sc) /*throws IOException*/{
		System.out.println("수정할 단어를 입력하세요.");
		int res = -1;
		String upWord = sc.next();
		
		for(Word tmp : list) {
			if(tmp.getWord().equals(upWord)) {
				System.out.println("수정할 뜻의 순서를 입력하세요.");
				int o = sc.nextInt();
				System.out.println("수정할 뜻을 입력하세요.");
				String upMean = sc.next();
//				tmp.getMean().setMean();
				res = 1;
				
				System.out.println("수정 완료.");
			}
		}
		if(res == -1) {
			System.out.println("수정할 단어 없음.");
		}
		
//		FileWriter fw = new FileWriter("word.txt");
//			for(Word tmp : list) {
//				String wordInfo = "단어 : " + tmp.getWord() + "\t뜻 : " + tmp.getMean() +"\r\n";
//				fw.write(wordInfo);
//			}
//		fw.close();
	}

	public void printWord() {
		for(Word tmp : list) {
			System.out.println(tmp);
		}
	}

	public void deleteWord(Scanner sc) /*throws IOException*/ {
		System.out.println("삭제할 단어를 입력하세요.");
		int res = -1;
		String delWord = sc.next();
		
		for(Word tmp : list) {
			if(tmp.getWord().equals(delWord)) {
				list.remove(tmp);
				res = 1;
				System.out.println("삭제 완료.");
				break;
			}
		}
		if(res == -1) {
			System.out.println("삭제할 단어 없음.");
		}
		
//		FileWriter fw = new FileWriter("word.txt");
//		for(Word tmp : list) {
//			String wordInfo = "단어 : " + tmp.getWord() + "\t뜻 : " + tmp.getMean() +"\r\n";
//			fw.write(wordInfo);
//		}
//		fw.close();
	}

	public void txtPrintWord() throws IOException {
		
		FileWriter fw = new FileWriter("word.txt");
		
		for(Word tmp : list) {
			String wordInfo = "단어 : " + tmp.getWord() + "\t뜻 : " + tmp.getMean() +"\r\n";
			fw.write(wordInfo);
		}
		fw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("word.txt"));
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		br.close();
	}

	public void testData() {
		System.out.println(list);
		for(Word tmp : list) {
			System.out.println(tmp.getWord() + tmp.getMean());
			for(int i=0; i<tmp.getMean().size(); i++) {
				System.out.println(tmp.getMean());
			}
		}
	}
}