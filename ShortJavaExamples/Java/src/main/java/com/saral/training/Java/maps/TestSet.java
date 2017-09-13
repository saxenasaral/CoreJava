package com.saral.training.Java.maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		
		set1.add("xy");
		set1.add("xy");
		set1.add("xy");
		set1.add("xy");
		set1.add("xy");
		set1.add("xy is there");
		
		for(Iterator<String> it = set1.iterator(); it.hasNext();){
			String x = it.next();
			System.out.println(x);
		}
	}

}
