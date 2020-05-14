package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation of InterfaceSymptomReader.
 *
 * @see InterfaceSymptomReader
 * @author VO Frederic
 * @version 1.0  
 */
public class SymptomReader implements InterfaceSymptomReader {
	
	/**
	 * Constructor getSymptoms
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line.
	 * @since 1.0
	 */
	private String filepath;
	
	
	public SymptomReader (String filepath) {
		this.filepath = filepath; 
	}
	
	/** 
	 * 
	 * It get symptom line per line from file "symptom.txt" and a raw list of Symptom
	 * 
	 * @return ArrayList of string (Symptoms)
	 * @since 1.0
	 */
	@Override 
	public List<String> getSymptoms() throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}

}