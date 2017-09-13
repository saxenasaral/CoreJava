package com.saral.training.Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class ThreadingExample implements Runnable{

	Properties prop = new Properties();
	InputStream input = null;
	static String y="0";
	public void run() {
		try {
			input = new FileInputStream("src\\main\\java\\config.properties");
			prop.load(input);
			Thread.sleep(10000);
			y=prop.getProperty("y");
			
			System.out.println(y);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread main = Thread.currentThread();
		Runnable run1 = new ThreadingExample();
		Thread thread1 = new Thread(run1);
		Scanner scn = new Scanner(System.in);
		thread1.start();
		thread1.join();
		int x=scn.nextInt();
		
		
		int sum = x+Integer.parseInt(y);
		System.out.println("sum is : "+sum);
	}

}
