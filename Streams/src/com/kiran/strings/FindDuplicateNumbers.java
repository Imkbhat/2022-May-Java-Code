package com.kiran.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {

	public static void main(String[] args) {

		
		List<Integer> intList = Arrays.asList(10, 20, 30, 40, 10, 50, 60, 20, 40, 70, 80, 80, 80);
		
		Set<Integer> intSet = new HashSet<Integer>();
		
		intList.stream().filter(x->!intSet.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
		
	}

}
