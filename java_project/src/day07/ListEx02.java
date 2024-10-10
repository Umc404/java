package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx02 {

	public static void main(String[] args) {
		// 두 배열을 하나의 리스트로 합치기
		// 정렬하여 출력(오름 / 내림)
		
		// 직접 값을 리스트로 옮기기
		// Arrays.asList() : 배열 => 리스트
		// toArray() : 리스트 => 배열
		
		String arr1[] = {"a", "s", "d", "f", "g", "h"};
		String arr2[] = {"q", "w", "e", "r", "t", "y"};
		
		List<String> listArr = Arrays.asList(arr1);
		// listArr 은 주소값이 들어감. 배열값이 아님. listArr.addAll(list2) <= 이거 오류남.
		List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
		List<String> list2 = new ArrayList<>(Arrays.asList(arr2));
		
		list1.addAll(list2);
		System.out.println("#### list 합친 값 ####");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println("오름차순 정렬 : Collections.sort");
		System.out.println(list1);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		System.out.println("#### arrList 합친 값 ####");
		List<String> arrList1 = new ArrayList<>();
		for(int i=0; i<arr1.length; i++) {
			arrList1.add(arr1[i]);
		}
		
		List<String> arrList2 = new ArrayList<>();
		for(int i=0; i<arr2.length; i++) {
			arrList2.add(arr2[i]);
		}
		
		arrList1.addAll(arrList2);		// arrList1, arrList2 두 list 합치기
		System.out.println(arrList1);	// 출력.
		
		System.out.println("내림차순 정렬 : sort(new Comparator<String>)");
		arrList1.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 결과가 -면 앞으로 보내고, + 뒤로 보내는 역할
				// o1 - o2 : 오름차순		o2 - o1 : 내림차순
				return o2.compareTo(o1);
			}
		});
		System.out.println(arrList1);
	}

}
