package com.kiran.streams;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		Optional<String> optional = Optional.empty();
		
		//System.out.println(optional.get());
		
		Optional<String> opt1 = Optional.of("Hello");
		
		System.out.println(opt1.get());
		
		String nullableString = "";
		Optional<String> opt2 = Optional.ofNullable(nullableString);
		
		System.out.println(opt2.get());
		
	}

}

