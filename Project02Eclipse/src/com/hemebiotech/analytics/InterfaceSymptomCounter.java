package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 *
 * From a list of all Symptoms.
 * It will count occurrences for each Symptoms.
 * It will sort Symptoms in ascending order using class TreeMap.
 * 
 * @see SymptomCounter
 * @author VO Frederic
 * @version 3.0 
 */
public interface InterfaceSymptomCounter {
	/**
	 * Count Symptoms occurrences.
	 * 
	 * @param symptoms a raw listing of all Symptoms.
	 * @return a TreeMap listing of all symptoms and their occurrences obtained from a list of Symptoms, duplicates are possible/probable.
	 * 
	 */
	TreeMap<String, Integer> countSymptoms(List<String> symptoms);

}