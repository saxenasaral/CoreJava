package com.saral.training.Java.threading;

class MyThread extends Thread{
	
	public void run(){
		for(int i = 0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" is current thread");
		}
	}
}

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		myThread.start();
		for(int i = 0; i<6;i++){
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+" is current thread in main");
		}
	}

}
