package com.saral.training.Java.comparableComparator;

import java.util.*;
import java.io.*;

public class TestSort3 {

	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		Collections.sort(al);
		Collections.sort(al, new Student());
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
