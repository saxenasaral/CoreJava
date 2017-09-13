package com.saral.training.Java.markerInterface;

public class ExampleCloneable implements Cloneable{
	

	public static void main(String[] args) throws CloneNotSupportedException {

		ExampleCloneable ex = new ExampleCloneable();
		
		ExampleCloneable ex1 =(ExampleCloneable) ex.clone();
	}

}
