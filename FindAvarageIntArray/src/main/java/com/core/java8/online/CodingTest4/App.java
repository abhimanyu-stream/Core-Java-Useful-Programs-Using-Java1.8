package com.core.java8.online.CodingTest4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
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
        
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;
        // access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
          sum += number;
        }
         // get the total number of elements
        int arrayLength = numbers.length;
        // calculate the average
        // convert the average from int to double
        
        Double result = (double)sum/arrayLength;
        //average =  ((double)sum / (double)arrayLength);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + result);
        
        List<Integer> listOfIntegerFromIntArray =  Arrays.stream(numbers).boxed().collect(Collectors.toList());
        System.out.println(listOfIntegerFromIntArray);
        OptionalDouble avarageValue = listOfIntegerFromIntArray.stream().mapToDouble(a -> a).average();
        System.out.println(avarageValue.isPresent() ? avarageValue.getAsDouble() : 0);
        /*
         * Streams
In Java 8+ you can make a stream of your int array. Call either Arrays.stream or IntStream.of.
Call IntStream#boxed to use boxing conversion from int primitive to Integer objects.
Collect into a list using Stream.collect( Collectors.toList() ). Or more simply in Java 16+, call Stream#toList().
Example:

int[] ints = {1,2,3};
List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
In Java 16 and later:

List<Integer> list = Arrays.stream(ints).boxed().toList();




int[] ints = {1, 2, 3};
List<Integer> intList = new ArrayList<Integer>(ints.length);
for (int i : ints)
{
    intList.add(i);
}
         * */
    }
}
