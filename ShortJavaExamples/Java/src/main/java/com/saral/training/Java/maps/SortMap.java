package com.saral.training.Java.maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map<String, Integer> unsortMap = new HashMap<String, Integer>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("j", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        
		printMap(unsortMap);

		Map<Integer, String> sortMap = new TreeMap<Integer, String>(
				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o1 - o2;
					}

				});

	//	sortMap.putAll(unsortMap);
	//	printMap(sortMap);

		Map<String, Integer> sort = sortByValue(unsortMap);
		
		printMap(sort);
	}

	static void printMap(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			System.out.println("key : " + entry.getKey() + " value: "
					+ entry.getValue());

		}
	}

	static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

		List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue();
			}
			
		});

		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> entry : list){
			
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}

}
