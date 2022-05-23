package com.kiran.streams;

import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {

		Stream<String> str1 = Stream.empty();
		System.out.println(str1.count());
		
		Stream<String> str2 = Stream.of("Test");
		System.out.println(str2.count());
		
Integer[] intArr = new Integer[] {1,2,3,4,5};
		
		Stream<Integer> intStream = Stream.of(intArr);
		
		int sum = intStream.filter(n->n%2 == 1)
				 .map(n -> n*n)
				 .reduce(0, Integer::sum);
		
		System.out.println(sum);
	}

}
