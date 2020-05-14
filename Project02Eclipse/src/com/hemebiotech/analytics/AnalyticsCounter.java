package com.hemebiotech.analytics;


import java.util.List;
import java.util.TreeMap;

/**
 * <b>AnalyticsCounter main class of the project is build to read file "symptom.txt" including Symptoms and to write out alphabetically all Symptoms and their occurrences.</b>
 * 
 * <p> 
 * AnalyticsCounter class includes classes and interfaces : 
 * <ul>
 * <li> SymptomReader which implements InterfaceSymptomReader : read file "symptom.txt". </li>
 * <li> SymptomCounter which implements InterfaceSymptomCounter : count occurrences of each Symptoms and sort Symptom in ascending order. </li>
 * <li> SymptomWriter which implements InterfaceSymptomWriter : write out result in file "result.out". </li>
 * </ul>
 * 
 * @see InterfaceSymptomReader
 * @see SymptomReader
 * @see InterfaceSymptomCounter
 * @see SymptomCounter
 * @see InterfaceSymptomWriter
 * @see SymptomWriter
 * 
 * @author VO Frederic
 * @version 3.0 
 * 
 */

public class AnalyticsCounter {

	/** 
	 * The main method of this project.
	 * 
	 * @param args array of string arguments.
	 * @throws Exception exception from writer.
	 * @since 1.0
	 */

	public static void main(String args[]) throws Exception {
		
		/** 
		 * Constant which includes relative path of "symptom.txt".
		 * 
		 * 
		 * @param filepath a full or partial path to file with Symptom strings in it, one per line.
		 * @since 3.0
		 */
		String filepath = "..//Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application//Project02Eclipse//symptoms.txt";
		
		/** 
		 * STEP 1 : Reading file "symptom.txt".
		 *  
		 *  @see InterfaceSymptomReader
		 *  @see SymptomReader
		 *  @since 3.0
		 */
		InterfaceSymptomReader reader = new SymptomReader(filepath);
		List<String> allSymptoms = reader.getSymptoms();

		/** 
		 * STEP 2 : Counting occurrences of Symptoms from file "symptom.txt" and sort Symptom in ascending order.
		 *  
		 *  @see InterfaceSymptomCounter
		 *  @see SymptomCounter
		 *  @since 3.0
		 */
		InterfaceSymptomCounter count = new SymptomCounter();
		TreeMap<String, Integer> counterSymptoms = count.countSymptoms(allSymptoms);
		
		/** 
		 * STEP 3 : Writing "result.out" including list of Symptoms and their occurrences in ascending order.
		 *  
		 *  @see InterfaceSymptomWriter
		 *  @see SymptomWriter
		 *  @since 3.0
		 */
		InterfaceSymptomWriter write = new SymptomWriter();
		write.writeSymptoms(counterSymptoms);
	}
}