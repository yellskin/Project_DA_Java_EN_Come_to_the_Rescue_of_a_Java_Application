package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Simple brute force implementation of InterfaceSymptomCounter.
 *
 * @see InterfaceSymptomCounter
 * @author VO Frederic
 * @version 3.0  
 */
public class SymptomCounter implements InterfaceSymptomCounter {

	/**
	 * Constructor countSymptoms
	 * 
	 * For example with a symptom name "SymptomA" : 
	 * 
	 * 	For each symptom from a list of symptom.
	 * 		If the SymptomA (key) is already in collection then count SymptomA + 1 in (value).
	 * 		Else count 0 + 1 (value) for SymptomA (key).
	 *	 Continue until list is empty 
	 * 
	 * @param symptoms a raw listing of all Symptom.
	 * @return mapSymptomsCounter a TreeMap with Symptoms (keys) and their occurrences (values).
	 * 				
	 */
	@Override
	public TreeMap<String, Integer> countSymptoms(List<String> symptoms) {

		TreeMap<String, Integer> mapSymptomsCounter = new TreeMap<>();
		for (String symptom : symptoms) {
			if (mapSymptomsCounter.containsKey(symptom)) {
				mapSymptomsCounter.put(symptom, mapSymptomsCounter.get(symptom) + 1);
			} else {
				mapSymptomsCounter.put(symptom, 1);
			}
		}
		return mapSymptomsCounter;
	}
}