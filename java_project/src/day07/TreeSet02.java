package day07;

import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {80, 78, 86, 46, 87, 98, 79, 34, 70};
		
		TreeSet<Integer> set = new TreeSet<>();
		for(int s : score) {
			set.add(s);
		}
		System.out.println(set);
		
		// headSet() : value보다 작은값들 / tailSet() : value 이상의 값들
		System.out.println(set.headSet(70));
		System.out.println(set.tailSet(70));
	}

}
