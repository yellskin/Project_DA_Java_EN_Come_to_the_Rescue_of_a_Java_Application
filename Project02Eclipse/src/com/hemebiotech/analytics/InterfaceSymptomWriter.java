package com.hemebiotech.analytics;


import java.util.TreeMap;

/**
*
* From a TreeMap of Symptoms and their occurrences sort in ascending order.
* It will write a file out of Symptoms and their occurrences.
*  
* @see SymptomWriter
* @author VO Frederic
* @version 3.0 
*/

public interface InterfaceSymptomWriter {
	/**
	 * Write out file "result.out".
	 * 
	 * @param countSymptoms TreeMap of all Symptoms and their occurrences sort in ascending order
	 */
	
	void writeSymptoms(TreeMap<String, Integer> countSymptoms);
}