package com.kiran.strings;

public class FInterfaceRunner {

	public static void main(String[] args) {

		Finterface mul = (a,b) -> a*b;
		
		System.out.println(mul.multiply(6, 7));
	}

}
