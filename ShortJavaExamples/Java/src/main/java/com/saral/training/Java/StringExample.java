package com.saral.training.Java;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Intern Example
		//Intern method will use String pools value
		String str = new String("abc");
		String str1 = "abc";
		String str2 = str1.intern();
		System.out.println(str==str1);
		System.out.println(str2==str);
		String str3 = "replace me";
		if(str3!=null){
			System.out.println(str);
			str3.replace('p', 'g');
			System.out.println("replace "+str);
		}

		String upperLower="upper and lower";
		System.out.println(upperLower.toLowerCase());
		System.out.println(upperLower.toUpperCase());
		
		String compare1="compare1";
		String compare2="compare2";
		
		System.out.println(compare1.compareTo(compare2));
		
	}

}
