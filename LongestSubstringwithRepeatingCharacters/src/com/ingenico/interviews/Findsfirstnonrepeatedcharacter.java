package com.ingenico.interviews;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Findsfirstnonrepeatedcharacter {
	
	public static void main(String[] args) {
		// Scanner definition
	    Scanner scn= new Scanner(System.in);
	      
	    // input is a string 
	    // read by nextLine()function
	    String str= scn.nextLine();
	      
	    // print string
	    System.out.println("Entered String : "+ str);
	    System.out.println(firstNonRepeatingChar(str));
	}

	public static char firstNonRepeatingChar(String word) { 
		Set<Character> nonRepeating = new HashSet<>(); 
		List<Character> repeating = new ArrayList<>(); 
		List<Character> repeatingAndAll = new ArrayList<>(); 
		for (int i = 0; i < word.length(); i++) { 
			char letter = word.charAt(i); 
			if (repeating.contains(letter) || !repeating.contains(letter)) { 
				//If List has letter then donot do any thing bu use of continue
				repeating.add(letter); // keeping duplicates
				//continue; 
			} 
			if (nonRepeating.contains(letter)) {
				
				//If set has letter then remove it and add into List
				//We are putting only unique value in the Set
				//nonRepeating.remove((Character) letter); 
				repeating.add(letter); //If Set has letter then do not do any with Set , but add into List
			} else { 
				// add into Set If Set do not contains this letter already
				nonRepeating.add(letter); //If Set do not have letter then  add into Set
			}
		} 
		
		System.out.println("List :"+repeating);
		System.out.println("Set : " +nonRepeating);
		return repeating.get(0); }
	}
	
