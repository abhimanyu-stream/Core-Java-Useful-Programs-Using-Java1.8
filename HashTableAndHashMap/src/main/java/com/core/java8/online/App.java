package com.core.java8.online;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
//import java.util.HashMap.Node;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Map<String, Integer> hashMap = new HashMap<>();
        Hashtable<String, String> hashTable = new Hashtable<>();
        Set<String> hashSet = new HashSet<>();
        System.out.println(hashSet);
        
        hashSet.add("Abhimanyu");
        System.out.println(hashSet);
        
        System.out.println(hashMap);
        hashMap.put("Abhimanyu", 1);
        System.out.println(hashMap);
        System.out.println(hashTable);
        hashTable.put("Abhimanyu", "Kumar");
        System.out.println(hashTable);
        
        System.out.println(429%30);
        
        for(int i = 0; i <= 250; i++) {
        	 System.out.println(" i" + i + ":  " +i%30);
        }
        //public V get(Object key) {
            //Node<K,V> e;
            //return (e = getNode(key)) == null ? null : e.value;
       // }
    }
}
