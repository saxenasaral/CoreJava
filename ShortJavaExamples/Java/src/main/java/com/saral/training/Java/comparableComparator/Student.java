package com.saral.training.Java.comparableComparator;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
	int rollno;
	String name;
	int age;

	Student(){
		
	}
	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		return this.name.compareTo(st.name);
	}

	public int compare(Student o1, Student o2) {

		return o1.age-o2.age;
	}
	
	static public void m1(){
		System.out.println("inside m1");
	}

}
