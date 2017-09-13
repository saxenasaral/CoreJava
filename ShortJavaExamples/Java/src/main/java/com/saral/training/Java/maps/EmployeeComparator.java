package com.saral.training.Java.maps;

import java.util.Comparator;


public class EmployeeComparator implements  Comparator<Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id-o2.id;
	}

}
