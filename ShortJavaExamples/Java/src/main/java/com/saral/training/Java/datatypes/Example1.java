package com.saral.training.Java.datatypes;

public class Example1 {

	public static void main(String[] args) {
		
		int x=999999;
		long b=x;
		long l = 214748364712l;
		double d=17777777770.2222222222222222;
		System.out.println((int)b);
		System.out.println((long)d);
		System.out.println((int)l);
		
		char c='2';
	
		int a =(int) c-'0';
		
		System.out.println((int)'g');
		System.out.println(Character.getNumericValue('g'));
	
		int da=39;
		String s=Integer.toString(da);
	
	}

}
