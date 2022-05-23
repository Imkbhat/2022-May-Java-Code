package com.kiran.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDataProvider {

	static Student s1 = new Student("Kiran","5","9",Arrays.asList("Reading","Writing"));
	static Student s2 = new Student("Karthik","6","10",Arrays.asList("Skating","Drifting"));
	static Student s3 = new Student("Divya","7","8",Arrays.asList("Dancing","Singing"));
	static Student s4 = new Student("Kavya","8","6",Arrays.asList("Painting","Playing"));
	static Student s5 = new Student("Bhavya","9","4",Arrays.asList("Sleeping","Bathing"));
	
	public static List<Student> getAllStudents() {
		
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		studentsList.add(s5);
		return studentsList;
	}
}
