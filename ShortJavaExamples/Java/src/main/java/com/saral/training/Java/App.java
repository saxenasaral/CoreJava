package com.saral.training.Java;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Integer.bitCount(5);
        
        
        int [] a = {1,4,3,2};
        for(int i=0;i<a.length/2;i++){
        	int j=a[i];
        	int k=a.length-(i+1);
        	a[i] = a[k];
        	a[k]=j;
        }
        
        for(int i=0;i<a.length;i++){
        	System.out.print(a[i]);
        }
        
    
    }
}
