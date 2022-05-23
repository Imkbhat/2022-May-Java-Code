package com.kiran.streams;

import java.util.ArrayList;
import java.util.List;

public class Student {

	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	String grade;
	String cgpa;
	
	List<String> activities = new ArrayList<String>();
	
	public Student(String name, String grade, String cgpa, List<String> activities) {
		this.name = name;
		this.grade = grade;
		this.cgpa = cgpa;
		this.activities = activities;
	}
}
