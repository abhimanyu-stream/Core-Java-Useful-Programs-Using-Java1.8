package com.core.java8.online;

import java.util.HashMap;
import java.util.Map;

public class App5 extends Thread{
	
	static HashMap<Integer,String> hashMap=new HashMap<Integer,String>();   
    public void run()   
    {   
        try  
        {   
            Thread.sleep(1000);   
            // Child thread trying to add object  
            // Adding new element in the object with the key 103  
            hashMap.put(103,"A");   
        }   
        catch(InterruptedException e)   
        {   
            System.out.println("Child Thread will add objects");   
        }   
    }   

    public static void main(String[] args) throws InterruptedException   
    {   
    	hashMap.put(100,"X");   
    	hashMap.put(101,"Y");   
    	hashMap.put(102,"Z");   
        App5 t=new App5();   
        t.start();  
        
        for(Map.Entry<Integer,String> s: hashMap.entrySet()) {
        	
        	s.setValue(null);
        	
        	
        }
        for (Object o : hashMap.entrySet())   
        {   
           // Object s=o;  
        	hashMap.put(null, null);
           // System.out.println(s);   
            Thread.sleep(1000);   
        }   
       
        System.out.println(hashMap);   
    }   

}
