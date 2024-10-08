package day07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성 : string
		 * 출력 for / 향상된 for / Iterator 출력
		 * import 단축키 : ctrl + shift + o
		 * 
		 */
		List<String> todoList = new ArrayList<>();
		
		todoList.add("밥");
		todoList.add("독서");
		todoList.add("광부");
		todoList.add("학원");
		todoList.add("운동");
		todoList.add("잠");
		todoList.add("동호회 일정 계획");
		
		System.out.println("#### add 순서대로 출력 ####");
		System.out.println(todoList);
		
		System.out.println();
		
		System.out.println("#### 기본 for문 ####");
		System.out.print("할 것들 : ");
		for(int i=0; i<todoList.size()-1; i++) {
			System.out.print(todoList.get(i)+", ");
		}
		System.out.println(todoList.get(todoList.size()-1));
		
		System.out.println();
		
		System.out.println("#### 향상 for문 ####");
		for(String tmp : todoList) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println();
		// 정렬 list.sort(compare 구현체);
		System.out.println("#### 문자 sort ####");
		todoList.sort(new Comparator<String>() {	// <> 안 T => 제네릭클래스 : 들어가긴 하는데 뭐가 들어가는지 모르는 미지수
			@Override
			public int compare(String o1, String o2) {
				// compareTo
				// return o1.compareTo(o2); : 오름차순
				// return o2.compareTo(o1); : 내림차순
				char cho1 = o1.charAt(0);
				char cho2 = o2.charAt(0);
				// o2 - o1 : 내림차순 
				// o1 - o2 : 오름차순
				return cho2 - cho1;
			}
		});
		System.out.println(todoList);
		todoList.remove("독서");
		System.out.println(todoList); // 만약 중복된 값이 있더라도 앞에 있는 하나만 삭제.
		
	}

}
