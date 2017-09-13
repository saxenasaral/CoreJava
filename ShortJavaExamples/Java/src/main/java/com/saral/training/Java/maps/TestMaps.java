package com.saral.training.Java.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;


public class TestMaps {
	EmployeeComparator ec = new EmployeeComparator();
	Hashtable HTable = new Hashtable();
	
	HashMap<Employee,Integer> hm = new HashMap<Employee,Integer>();
	HashMap<Employee,String> hm1 = new HashMap<Employee,String>();
	LinkedHashMap LinkedHashMap = new LinkedHashMap();
	TreeMap TreeMap = new TreeMap(ec);
	IdentityHashMap IdentityHashMap = new IdentityHashMap();
//	EnumMap EnumMap = new EnumMap();
	WeakHashMap WeakHashMap = new WeakHashMap();
	
	//  Collections.synchronized
	
	ConcurrentHashMap ConcurrentHashMap = new ConcurrentHashMap();
	
	
	
	
	
	void createMap(){
		Employee e1 = new Employee(01,"one");
		
		hm.put(null,01);
		hm.put(null,01);
		hm.put(new Employee(01,"one"),2);
		hm.put(new Employee(01,"one"),01);
		hm.put(new Employee(01,"one"),01);
		hm.put(new Employee(01,"one"),01);
		System.out.println("hashmap created");
		
		
		HTable.put(e1,01);
		HTable.put(e1,01);
		HTable.put(new Employee(01,"one"),01);
		HTable.put(new Employee(01,"one"),01);
		HTable.put(new Employee(01,"one"),01);
		
		System.out.println("hashTable created");
		
		LinkedHashMap.put(null,01);
		LinkedHashMap.put(null,01);
		LinkedHashMap.put(new Employee(01,"one"),01);
		LinkedHashMap.put(new Employee(01,"one"),02);
		LinkedHashMap.put(new Employee(01,"one"),01);
		LinkedHashMap.put(new Employee(01,"one"),01);
		
		TreeMap.put(new Employee(01,"one"),01);
		TreeMap.put(new Employee(01,"one"),01);
		TreeMap.put(new Employee(01,"one"),01);
		TreeMap.put(new Employee(01,"one"),01);
		TreeMap.put(new Employee(01,"one"),01);
		TreeMap.put(new Employee(01,"one"),01);
		/*
		IdentityHashMap.put(new Employee(01,"one"),01);
		IdentityHashMap.put(new Employee(01,"one"),01);
		IdentityHashMap.put(new Employee(01,"one"),01);
		IdentityHashMap.put(new Employee(01,"one"),01);
		IdentityHashMap.put(new Employee(01,"one"),01);
		
		
		WeakHashMap.put(new Employee(01,"one"),01);
		WeakHashMap.put(new Employee(01,"one"),01);
		WeakHashMap.put(new Employee(01,"one"),01);
		WeakHashMap.put(new Employee(01,"one"),01);
		WeakHashMap.put(new Employee(01,"one"),01);
		WeakHashMap.put(new Employee(01,"one"),01);
		*/
		ConcurrentHashMap.put(new Employee(01,"one"),01);
		ConcurrentHashMap.put(new Employee(01,"one"),01);
		ConcurrentHashMap.put(new Employee(01,"one"),01);
		ConcurrentHashMap.put(new Employee(01,"one"),01);
		ConcurrentHashMap.put(new Employee(01,"one"),01);
		ConcurrentHashMap.put(new Employee(01,"one"),01);
		
		
	}
	
	void anyIndex(){
		
	}
	
	void forMap(){
		
		
		for(Employee key : hm.keySet()){
			System.out.println("key "+key+" value "+hm.get(key));
			if(hm.get(key)==2){
				System.out.println("delete done");
				hm.remove(key);
			}
		}
		
		for(Map.Entry<Employee,Integer> entry : hm.entrySet()){
			System.out.println(entry.getKey()+" key"+entry.getValue()+" value");
			
		}
	}
	
	void iterateMap(){
		
		
		
		Iterator it = LinkedHashMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey()+": key"+pair.getValue()+" :value");
			if(pair.getValue().equals(new Integer(2))){
				it.remove();
				
				//	hm.remove(key);
				}
			
		}
		
		
		Iterator it1 = hm.keySet().iterator();
		while(it1.hasNext()){
			
			Employee e = (Employee) it1.next();
			System.out.println("key "+e+" value "+hm.get(e));
			
		}
		
	}
	
	void whileMap(){
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMaps TestMaps = new TestMaps();
		TestMaps.createMap();
		TestMaps.iterateMap();
		TestMaps.forMap();
	}

}
