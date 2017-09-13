package com.saral.training.Java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[2];
		System.out.println(arr);
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        
        LinkedList<Integer> ll = new LinkedList<Integer>();
        
        Object []obr =al.toArray();
  //      Integer[] ar=obr;
        
        for(Object i:obr){
        	System.out.println(i);
        }
        
        Integer[] ar1 =  new Integer[al.size()]; 
        ar1 = al.toArray(ar1);
        for(Integer i:ar1){
        	System.out.println(i);
        }
        System.out.println("arrays "+Arrays.toString(arr));
        
	}

}
