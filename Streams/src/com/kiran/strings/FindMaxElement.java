package com.kiran.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {

	public static void main(String[] args) {

		List<Integer> maxList = Arrays.asList(1,2,3,4,5,7,10);
		
		Integer lint =  maxList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(lint);
		
		Integer mint = maxList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(mint);
	}

}
