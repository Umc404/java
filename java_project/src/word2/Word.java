package word2;

import java.util.ArrayList;
import java.util.List;
	/* 단어장 프로그램
	 * Word class 생성
	 *  1. 단어 등록 | 2.단어 검색 | 3. 단어 수정 | 4. 단어 출력 | 5. 단어 삭제 | 6. 단어파일로 출력 | 7. 종료
	 * - 단어 뜻 list > List<String> = new ArrayList<>()
	 *
	 * Word(equals 사용) : 단어가 같으면 같은 객체
	 * txt 파일로 저장
	 */
public class Word {
	List<Word> list = new ArrayList<>();
	private String word;
	private List<String> mean = new ArrayList<>();
//	private int cnt = 1;
	
	public Word() {}
	
	public Word(String word, List<String> mean) {
//		this.cnt = cnt;
		this.word = word;
		this.mean = mean;
	}
	
	@Override
	public String toString() {
		return "word=" + word + ", mean=" + mean;
	}

	// getter / setter
	public List<Word> getList() {
		return list;
	}

	public void setList(List<Word> list) {
		this.list = list;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public List<String> getMean() {
		return mean;
	}

	public void setMean(List<String> mean) {
		this.mean = mean;
	}
	
}