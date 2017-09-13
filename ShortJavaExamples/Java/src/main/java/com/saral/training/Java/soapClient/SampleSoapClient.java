package com.saral.training.Java.soapClient;

import com.saral.training.Java.soapClient.org.tempuri.Calculator;
import com.saral.training.Java.soapClient.org.tempuri.CalculatorSoap;

public class SampleSoapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator Calculator= new Calculator();
		CalculatorSoap CalculatorSoap=Calculator.getCalculatorSoap();
		
		int res = CalculatorSoap.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println("result is : "+res);
	}

}
