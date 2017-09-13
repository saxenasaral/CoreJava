package com.saral.training.Java.assosiation;

public class composition {

	private final composition2 var1;
	
	composition(composition2 var1){
		this.var1=var1;
	}
	
	
	public composition2 getVar1() {
		return var1;
	}

	public static void main(String[] args) {
		composition composition = new composition(new composition2("saxena sahab"));
		System.out.println(composition.var1.var);
	}

}

class composition2{
	
	String var;
	composition2(String var){
		this.var=var;
	}
}