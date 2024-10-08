package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스, 반드시 구현 클래스로 객체를 생성
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열 대신 사용
		 * 
		 * List(배열과 동일)
		 * - 값을 하나씩 저장
		 * - index : 순서를 보장
		 * - 중복 허용
		 * - 배열 대신에 가장 많이 사용하는 구조
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - index가 없음 : 순서를 보장하지 않음.
		 * - 중복 허용되지 않음.(같은 값이 입력되면 덮어씀.)
		 * 
		 * Map
		 * - 값을 두개씩 저장 key/value 쌍으로 저장
		 * - index는 없고, key가 index 역할을 함.
		 * - key는 중복 불가능 / value는 중복 가능
		 * - key가 중복되면 value는 덮어써짐.
		 * - 2개의 값이 하나의 자료로 묶여야 할 때 사용.
		 * - 아이디/패스워드, 제품명/가격, 학생명/점수
		 * 
		 * 배열은 기본자료형
		 * int arr[], double arr[], String arr[], Student arr[] 다 가능.
		 * 
		 * Collection은 기본자료형은 불가능. 클래스 자료형만 가능.
		 * 래퍼클래스(wrapper Class) : 기본 타입의 자료형을 클래스 타입으로 변환한 클래스.
		 * 기본자료형 (Boxing) > 클래스자료형
		 * 클래스자료형 (unBoxing)> 기본자료형
		 * 
		 * 기본자료형	>  래퍼클래스
		 * int 		>  Integer
		 * char		>  Character
		 * byte		>  Byte
		 * short	>  Shot
		 * long		>  Long
		 * float	>  Float
		 * double	>  Double
		 * boolean	>  Boolean
		 * 
		 * Collection에서 클래스를 지정하지 않으면 Object가 자동으로 설정
		 * 
		 * 리스트 생성
		 * List<className> 객체명 = new 구현클래스<className>();
		 * List<Integer> list = new ArrayList<Integer>();
		 * List의 구현클래스 => ArrayList, LinkedList
		 * 
		 * ArrayList : 검색 시 유리(배열과 유사한 형태)
		 * - 미리 길이를 지정하지 않음. 추가되면 늘어남. 삭제되면 줄어듦.
		 * - 추가, 삭제가 쉬움. 검색이 쉬움
		 * LinkedList : 추가 / 삭제가 많을 경우 유리
		 * - 중간에 값을 끼워넣거나, 빼는 게 쉬움.
		 * - 검색이 느림.
		 */

		int num = 10;
		Integer boxNum = 20; // 자동 박싱 
		int a = boxNum; // 자동 언박싱
		
		System.out.println(boxNum);
		System.out.println(a);
		
		// 클래스.parse+기본타입명 = 형변환 가능.
//		String str = "10";
//		int i = Integer.parseInt(str);
//		System.out.println(i);
		
		List<Integer> list = new ArrayList<Integer>();			// 부모를 기준을 생성
		ArrayList<Integer> list2 = new ArrayList<Integer>();	// 자식 기준으로 생성
		List list3 = new ArrayList();							// Object로 생성
		ArrayList<Integer> list4 = new ArrayList<>();			// 구현체 클래스는 생략가능 <>
		
		List<Integer> linkedList = new LinkedList<>();			// LinkedList 생성
		
		/* List method
		 * - add() : 요소를 추가하는 방법
		 * - get() : 요소를 
		 * */
		
		// - add() : 요소를 추가하는 방법
		list.add(1); // list.get(0)
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		// - get() : index 번지의 요소를 가져옴
		System.out.println(list.get(0));
		
		// - set(index, value) : index 번지의 값을 value로 변환 
		list.set(3, 12);		// list[3] = 12;
		System.out.println(list);
		
		// - size() : list의 개수
		System.out.println("list의 size : "+list.size());
		System.out.print("list 내역 : ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// 문자열을 담는 리스트 생성
		// 문자열 5개 저장한 후 출력
		
		List<String> strList = new ArrayList<>();
		
		strList.add("asdf");
		strList.add("qwer");
		strList.add("zxcv");
		strList.add("wasd");
		strList.add("6n23");
		System.out.println(strList);
		for(String tmp : strList) {
			System.out.println(tmp);
		}
		
		// - remove(index) : index 번지 값 삭제 => List 에서만 가능.
		// - remove(obJect) : object 요소 삭제 => set/map
//		strList.remove(0);
//		System.out.println(strList); // "asdf" 삭제
//		strList.remove("wasd");
//		System.out.println(strList); // "wasd" 삭제
		System.out.println(list);
//		list.remove(10); // 값이 10인 사항을 삭제하는 것이 아닌 10번째 값을 삭제. 배열값 자체가 없어 오류.
		Integer rm = 3;		
		list.remove(rm);		// 객체 생성하여 값이 3인 배열위치 삭제
		System.out.println(list);
		
		// - contains(object) : list 내 object 값이 있는지 검사 true / false
		System.out.println(strList.contains("wasd"));
		
		for(String tmp : strList) {
			if(strList.contains("wasd")) {
				// 리턴값이나 세팅값 변환 뭐 그런거
			}
		}
		
		// - clear() : 리스트 비움
		strList.clear();
		System.out.println(strList);
		
		// - isEmpty() : 리스트가 비어있는지 확인 true / false
		System.out.println(strList.isEmpty());
		
		/* Iterator : index 가 없는 자료형을 출력하기 위해 사용.
		 * list 는 index가 있기 때문에 get(i)를 사용하여 접근 가능.
		 * set/map 은 index 가 없기 때문에 일반 for문 사용불가
		 * (향상된 for문만 가능 - map은 불가능)
		 * 순서와 상관없이 값을 가져올 수 있는 Iterator 사용
		 * map은 향상된 for, Interator 둘 다 직접 사용은 불가능
		 */
		System.out.println("--- Iterator 출력 ---");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {			// it 다음 요소값이 있는 체크 true / false
			Integer tmp = it.next();	// 다음 요소 가져오기
			System.out.println(tmp);
		}
		
		// - indexOf(object) : 해당 object의 인덱스를 리턴 / 없으면 -1 
		list.add(52);
		list.add(21);
		list.add(44);
		list.add(78);
		list.add(32);
		System.out.println(list);
		
		// 정렬
		// Collection.sort(); // 오름차순만 가능
		System.out.println("collection");
		Collections.sort(list);
		System.out.println(list);
		
		//list.sort(Comparator를 구현한 구현체) : 정렬
		// Comparator 인터페이스를 구현한 구현체를 넣어야 함.(익명클래스)
		// - compareTo : 사전상 앞이면 -1, 같으면 0, 뒤면 +1
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// 결과가 -면 앞으로 보내고, + 뒤로 보내는 역할
				// o1 - o2 : 오름차순		o2 - o1 : 내림차순
				return o2 - o1;
			}
		});
		System.out.println(list);
		
		
		
		
		
		
		
		
	}
	
	

}
