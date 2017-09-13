package com.saral.training.Java.passByValue;

public class Test {

	 int id;
	Test(int id){
		this.id=id;
	}
	int changeId(int id){
		return this.id=id;
	}
}
