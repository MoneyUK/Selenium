package com.repetitive.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
					
						// REPETITIVE LETTERS
public class REPETITIVE_LETTERS{
	public static void main(String[] args) {
		String u ="UDAYAKUMAR UK";
		String[]word = u.split("");
		Map<String,Integer> wordmap=new HashMap<String,Integer>();
		for (String string :word){
			if(wordmap.containsKey(string)) {
				Integer integer =wordmap.get(string);
				wordmap.put(string, integer+1);
			}else {
				wordmap.put(string, 1);
			}
		}
		System.out.println("***REPETITIVE WORDS***");
		Set<java.util.Map.Entry<String, Integer>>entryset=wordmap.entrySet();
		 
		for(java.util.Map.Entry<String, Integer> entry :entryset) {
			if(entry.getValue()>0) {
				String key=entry.getKey();
				Integer value =entry.getValue();
				System.out.println(key+ "="+value);
			}
		}
			}
	
		
	}
	


