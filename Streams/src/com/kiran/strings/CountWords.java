package com.kiran.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {

	public static void main(String[] args) {
		
		String word="welcome to code decode and code decode welcome you";
		String[] wordArr = word.split(" ");
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		
		for(String str : wordArr ) {
			if(wordCountMap.containsKey(str)) {
				wordCountMap.put(str, wordCountMap.get(str) + 1);
			} else {
				wordCountMap.put(str, 1);
			}
		}
		
		System.out.println(wordCountMap);
		
		System.out.println("===========================================");
		
		List<String> wordsList = Arrays.asList(word.split(" "));
		
		Map<String, Long> map = wordsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		
	}

}
