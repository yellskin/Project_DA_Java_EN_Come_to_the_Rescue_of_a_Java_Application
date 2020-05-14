package com.hemebiotech.analytics;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 

public class AnalyticsCounter {

	static Map<String, Integer> symptomsOccurrences = new HashMap<String, Integer>(); 

	public static void main(String args[]) throws Exception { 

		// Step 1 : Reading symptoms.txt
		BufferedReader reader = new BufferedReader(new FileReader(
				"..//Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application//Project02Eclipse//symptoms.txt"));
		String line = reader.readLine();

		// Step 2 : Counting Symptoms occurrences
		while (line != null) { 
			if (symptomsOccurrences.containsKey(line)) { 
				symptomsOccurrences.put(line, symptomsOccurrences.get(line) + 1);
			} else {
				symptomsOccurrences.put(line, 1); 
			}
			line = reader.readLine(); 
		}

		// Step 3 : Sorting Symptoms in ascending order
		List<String> listSymptoms = new ArrayList<String>(symptomsOccurrences.keySet()); 
		Collections.sort(listSymptoms); 

		// Step 4 : Writing result.out
		FileWriter writer = new FileWriter("result.out"); 
		writer.write("Symptoms list and occurrences \n");
		for (String symptom : listSymptoms) {
			writer.write(symptom + "=" + symptomsOccurrences.get(symptom)  + "\n");  
		}
		writer.close();
		reader.close();
	}
}