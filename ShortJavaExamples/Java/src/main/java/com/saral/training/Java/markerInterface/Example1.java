package com.saral.training.Java.markerInterface;

import java.io.IOException;
import java.io.Serializable;

public class Example1 implements Serializable {

	private static final long serialVersionUID = 7557252894845332426L;

	String a = "saral";
	int b = 10;
	int c = 9;
	transient String d = "nothing";
	Example1(){
		a="ereer";
		b=19;
		c=34;
	}
	
	@Override
	public String toString() {
		return "Example1 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public static void main(String[] args) {

		Example1 ex = new Example1();
		System.out.println(ex.toString());
		try {
			Utility.serialize(ex);
			Example1 ex1=(Example1)Utility.deSerialize();
			System.out.println(ex1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
