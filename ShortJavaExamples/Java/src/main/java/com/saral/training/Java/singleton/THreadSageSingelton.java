package com.saral.training.Java.singleton;

public class THreadSageSingelton {

	 private static THreadSageSingelton instance;
	    
	    private THreadSageSingelton(){}
	    
	    public static synchronized THreadSageSingelton getInstance(){
	        if(instance == null){
	            instance = new THreadSageSingelton();
	        }
	        return instance;
	    }
}
