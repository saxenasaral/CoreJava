package com.saral.training.Java;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum=0;
        int cs=Integer.MIN_VALUE;
        Integer checkSum = null;
        boolean check=true;
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr[i].length-2;j++){
          sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(check){
                	checkSum=sum;
                	check=false;
                }
          		if(checkSum<sum){
                    checkSum=sum;
                }
            }
        }
        System.out.println(checkSum);

		System.out.println(1+2+-3-4);
		if(2>-4){
			System.out.println("yes");	
		}
		
	}

}
