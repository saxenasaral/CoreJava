package com.saral.training.Java.maps;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		
		al.add("a");
		al.add("3");
		al.add("7");
		al.add("b");
		al.add("c");
		al.add(2, "b");
		
		ll.add("a");
		ll.add("a");
//		
		ll.add("a");
		ll.add("a");
		ll.add("a");
		ll.add(4, "c");
		System.out.println(al);
		System.out.println(ll);
	}

}
