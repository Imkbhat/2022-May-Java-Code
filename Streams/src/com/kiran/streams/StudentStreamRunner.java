package com.kiran.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StudentStreamRunner {

	public static void main(String[] args) {
		
		
		List<Student> studentList = StudentDataProvider.getAllStudents();
		
		studentList.stream()
		
		.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentList);
	}

}
