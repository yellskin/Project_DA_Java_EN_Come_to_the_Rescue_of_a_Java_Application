package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Simple brute force implementation of InterfaceSymptomWriter.
 * 
 * @see InterfaceSymptomWriter
 * @author VO Frederic
 * @version 3.0  
 */
public class SymptomWriter implements InterfaceSymptomWriter {

	/**
	 * Constructor writeSymptoms
	 *
	 * 
	 * Writing out a file "result.out".
	 * Using Filewriter class. It will write line per line Symptoms (key) and his Occurrences (value).
	 * 
	 * @param countSymptoms a TreeMap with Symptoms (keys) and their occurrences (values).
	 * 				
	 */
	@Override
	public void writeSymptoms(TreeMap<String, Integer> countSymptoms) {
		
		TreeMap<String,Integer> map = new TreeMap<String,Integer>(countSymptoms);
		
		try {

			FileWriter writer = new FileWriter("result.out");
			writer.write("Symptoms list and occurences \n");
			writer.write("--- \n");
			for (Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
				Entry<String, Integer> m = iterator.next();
				writer.write(m.getKey() + " " + "=" + " " + m.getValue() + ";" + "\n");
			}
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}