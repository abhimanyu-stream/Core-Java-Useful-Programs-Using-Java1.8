package com.core.java8.online;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class App3 {
	
	public static void main(String[] args) {
		
		
		List<Integer> listOfInt = Arrays.asList(1, 2, 3);
		
		System.out.println(listOfInt);
        String delimeter = ",";
 
        String result = StringUtils.join(listOfInt, ",");
 
        System.out.println(result);  
	}

}
