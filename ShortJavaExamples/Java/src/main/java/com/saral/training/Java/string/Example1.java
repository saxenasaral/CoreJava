package com.saral.training.Java.string;

import java.util.StringTokenizer;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer(2);
		StringBuffer s = new StringBuffer("saxena sahab");
		System.out.println(s.length()+" "+s.capacity());
		s.append("ji");
		System.out.println(s.length()+" "+s.capacity());
		s1.append("saxena sahab");
		System.out.println(s1);
		System.out.println(s1.length()+" "+s1.capacity());
		
		
		String token = "saxena sahab kese hai?";
		StringTokenizer st = new StringTokenizer(token, " ",true);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
