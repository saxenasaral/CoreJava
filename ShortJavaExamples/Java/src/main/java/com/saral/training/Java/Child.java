package com.saral.training.Java;

public class Child extends Parent{
int value = 1000;
	int [] ch;
	static Parent parent;
	final int i;
	static final int j=4;
	static int k;
	
	private Child(String s, int [] ch){
		super(s);
		i=10;
		this.ch=ch;
		this.myString=s;
		
	}
	public static void m1(){
		parent.toString();
	}
	final static void m2(){
		
	}
	final static void m2(String s){
		
	}
	
	
	public static void main(String[] args) {
		int [] ch={2,2,2,2};
		Child c = new Child("sd",ch);
		// TODO Auto-generated method stub
		System.out.println(c.myString+" "+k);
	//	m1();
		
		
		System.out.println(c.value);
		Parent p=c;
	//	System.out.println(p.value);
	}

}
