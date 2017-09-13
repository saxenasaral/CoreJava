package com.saral.training.Java.abstraction;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer>{
	private Map<String, Customer> records;

	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}

	public Map<String, Customer> getRecords() {
		return new HashMap<String, Customer>(this.records);
	}
	
	public Map<String, Customer> getImmutableRecords() {
		return Collections.unmodifiableMap(this.records);
	}

	public void addRecord(Customer c) {
		this.records.put(c.getName(), c);
	}

	public Iterator<Customer> iterator() {
		Customer v = new Customer("x");
		String z = v.name;
		return records.values().iterator();
	}
	
	public Customer getCustomerByName(String name){
		return records.get(name);
	}
	
	public CustomerApi getCustomerByNameByNew(String name){
		return this.records.get(name);
	}

}
