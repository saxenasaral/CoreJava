package com.saral.training.Java.abstraction;

public class Main {

	
	public void m(){
		CustomerApi cust = new Customer("saral");
		String n = cust.getName();
	}

	public static void main(String[] args) {

		
		CustomerRecords record = new CustomerRecords();
		record.addRecord(new Customer("abc"));
		record.addRecord(new Customer("xyz"));
		
	//	record.getImmutableRecords().clear();
		
	
		System.out.println(record.getCustomerByName("abc"));
		//Customer a = record.getCustomerByName("abc");
		CustomerApi a = record.getCustomerByNameByNew("xyz");
		System.out.println(a);

		System.out.println(a);
		
		for(CustomerApi x : record){
			System.out.println(x.getName());
		}
	}


}
