package com.corejava8.learning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        List<Order> listOfCustomer = new ArrayList<>();
        listOfCustomer.add(new Order(1L, "Java", 5000.00, OrderType.ONLINE));
        listOfCustomer.add(new Order(2L, "SpringBoot", 7000.00, OrderType.OFFLINE));
        listOfCustomer.add(new Order(3L, "JPA", 8000.00, OrderType.ONLINE));	 
        listOfCustomer.add(new Order(4L, "Hibernate", 10000.00, OrderType.OFFLINE));
        listOfCustomer.add(new Order(5L, "CoreJava8", 654000.00, OrderType.ONLINE));
        
        // sort by price
        
        listOfCustomer.sort(Comparator.comparing(Order::getPrice));
        System.out.println(listOfCustomer);
        //sort by name
        listOfCustomer.sort(Comparator.comparing(Order::getName));
        System.out.println(listOfCustomer);
        //filter by online
        List<Order> onlineListOfOrder = listOfCustomer.stream().filter(order -> order.getOrderType().equals(OrderType.ONLINE)).collect(Collectors.toList());
        System.out.println(onlineListOfOrder);
        //filter by offline
        List<Order> offlineListOfOrder = listOfCustomer.stream().filter(order -> order.getOrderType().equals(OrderType.OFFLINE)).collect(Collectors.toList());
        System.out.println(offlineListOfOrder);
        //filter by price below 7500.00
        
        List<Order> below7500ListOfOrder = listOfCustomer.stream().filter(order -> order.getPrice()<7500.00).collect(Collectors.toList());
        System.out.println(below7500ListOfOrder);	
        List<Order> below7500ListOfOfflineOrder = listOfCustomer.stream().filter(order -> order.getOrderType().equals(OrderType.OFFLINE)).filter(order -> order.getPrice()<7500.00).collect(Collectors.toList());
        System.out.println(below7500ListOfOfflineOrder);		
    }
}
