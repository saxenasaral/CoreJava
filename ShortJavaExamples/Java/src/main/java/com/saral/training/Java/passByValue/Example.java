package com.saral.training.Java.passByValue;

public class Example {

	public static void main(String[] args) {

		Test test = new Test(25);
		modify(test,52);
		System.out.println(test.id);
		
	}
	
	static void modify(Test t,int i){
		t.changeId(i);
		System.out.println("in modify method"+t.id);
	}

}
