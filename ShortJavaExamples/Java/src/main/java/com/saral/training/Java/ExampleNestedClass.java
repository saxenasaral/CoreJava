package com.saral.training.Java;

public class ExampleNestedClass {
	 // static member
    static int outer_x = 10;
     
    // instance(non-static) member
    int outer_y = 20;
     
    // private member
    private static int outer_private = 30;
    
    static class StaticNestedClass{
    	void display(){
    	//	System.out.println("outer_y "+outer_y);
    		
    		System.out.println("outer_private "+outer_private);
    		
    		System.out.println("outer_x "+outer_x);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleNestedClass.StaticNestedClass obj = new ExampleNestedClass.StaticNestedClass();
		obj.display();
		
	}

}
