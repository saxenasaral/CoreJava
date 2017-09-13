package com.saral.training.Java.dateFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;


public class DateFormatterTest {
	
	private static final class ComparatorImplementation implements Comparator<Map.Entry<Integer, ArrayList<Integer>>> {
		

		public int compare(Entry<Integer, ArrayList<Integer>> o1,
				Entry<Integer, ArrayList<Integer>> o2) {
			// TODO Auto-generated method stub
			return o1.getValue().get(2)-o2.getValue().get(2);
		}
	}



	static ArrayList<Integer> convertStringArraytoList(String[] s){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(String a : s){
			list.add(Integer.valueOf(a));
		}
		return list;
	}
	
	static Map<Integer, ArrayList<Integer>> sortByValue(Map<Integer, ArrayList<Integer>> unsorted){
		
		List<Map.Entry<Integer, ArrayList<Integer>>> list= new LinkedList<Map.Entry<Integer, ArrayList<Integer>>>();
		
		Collections.sort( list, new ComparatorImplementation());
		
		return null;
	}
	
	public static String[] dateSort(String[] dateFormat) throws ParseException{
		
		// without date formatter
		
		Map<Integer, ArrayList<Integer>> dateTree = new TreeMap<Integer, ArrayList<Integer>>(
				
				new Comparator<Integer>() {

					public int compare(Integer o1, Integer o2) {
						return 0;
					}
					
					
					
					
				}
				
				
				
				
				
				);
		
		Map<Integer, ArrayList<Integer>> datemap = new HashMap<Integer, ArrayList<Integer>>();
		
		System.out.println("split: "+dateFormat[0].split("/"));
		
		for(int i=0;i<dateFormat.length;i++){
			
			String[] x = dateFormat[0].split("/");
			datemap.put(i, convertStringArraytoList(x));
			System.out.println("print split: "+Arrays.toString(x));
			
		}
		// with date formatter
		String pattern = "dd/mm/yyyy";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		
		TreeSet<Date> dateSet = new TreeSet<Date>();
		ArrayList<Date> List = new ArrayList<Date>();
		
		//convert String to Date for set and list
		for(int i=0;i<dateFormat.length;i++){
			Date date = (Date)format.parse(dateFormat[i]);
			dateSet.add(date);
			List.add(date);
		}
		
		//printing set and list
		System.out.println(dateSet);
		System.out.println(List);
		
		//sorting list
		Collections.sort(List);
		
		String [] ar = new String[dateFormat.length];
		
		// convert set of date to arrays of String
		Iterator<Date> it = dateSet.iterator();
		while(it.hasNext()){
			String setDate = format.format(it.next());
			System.out.println(setDate);
			Arrays.fill(ar,0,dateFormat.length, setDate);
		
		}
		System.out.println("printing converted set"+Arrays.toString(ar));
		
		// convert list of Date to arrays of String
		for(int i = 0;i<List.size();i++){
			String fordate = format.format(List.get(i));
			dateFormat[i] = fordate;
		}
		return dateFormat;
		
	}
	
	

	public static void main(String[] args) {
		String [] arr={"22/07/6226","21/07/1991","24/07/1991"};
			System.out.println(Arrays.toString(arr));
		try {
			System.out.println("in main method"+Arrays.toString(dateSort(arr)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
