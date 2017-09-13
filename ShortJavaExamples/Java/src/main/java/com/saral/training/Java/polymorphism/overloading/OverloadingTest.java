package com.saral.training.Java.polymorphism.overloading;

public class OverloadingTest {
	/*
		public static  void m(Integer i) {
	System.out.println("in integer");
}*/

/*
	public static void m(Object ob) {
		System.out.println("in object");
	}*/
	
	public static void m(String s) {
		System.out.println("in string");
	}
/*	
	public static void m(StringBuffer sb) {
		System.out.println("in StringBuffer");
	}*/

	/*
	public static void m(User us) {
		System.out.println("in User");
	}*/

	/*
	public static void m(ChildUser us) {
		System.out.println("in ChildUser");
	}*/


	
	public static void m(int i) {
		System.out.println("in int");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(null);
	}

}
