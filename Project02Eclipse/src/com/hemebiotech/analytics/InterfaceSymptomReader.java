package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List; 

/**
 *
 * From a file "symptom.txt" of Symptoms, it will read line per line and return a list of strings. That may contain many duplications.
 * 
 * @see SymptomReader
 * @author VO Frederic
 * @version 1.0 
 */
public interface InterfaceSymptomReader { 
	/**
	 * Get all symptoms.
	 * 
	 * Replace method GetSymptoms by getSymptoms.
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable.
	 * @throws IOException If empty list.
	 * @since 3.0
	 */
	List<String> getSymptoms () throws IOException; 
}