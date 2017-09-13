package com.saral.training.Java.threading;

public class BattingStatics extends Thread{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("batting statics "+i);
		}
	}
	static public void m(){
		final int x=10;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BattingStatics bt = new BattingStatics();
		Class c1 = bt.getClass();
		System.out.println();
		Object onj = new Object();
		
	}

}
