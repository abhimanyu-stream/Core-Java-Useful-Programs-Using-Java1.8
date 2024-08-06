package com.core.java8.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Queue Implementation using Array" );
        //1.
        Queue queue = new Queue(10);
        System.out.println(queue.maxSize);
        System.out.println(queue.currentNumberOfElementsInQueue);
        System.out.println(queue);
        
        //2.
        //Insert new element into Queue
        /**[A]
        int x1 = queue.insertElementInQueue(1);
        System.out.println(queue);
        queue.removeElementFromQueue();
        int x2 = queue.insertElementInQueue(2);
        System.out.println(queue);
        queue.removeElementFromQueue();
        int x3 = queue.insertElementInQueue(3);
        System.out.println(queue);
        queue.removeElementFromQueue();
        int x4 = queue.insertElementInQueue(4);
        System.out.println(queue);
        queue.removeElementFromQueue();
        int x5 = queue.insertElementInQueue(5);
        System.out.println(queue);
        queue.removeElementFromQueue();
        queue.removeElementFromQueue();
        int x6 = queue.insertElementInQueue(6);
        System.out.println(queue);
        queue.removeElementFromQueue();
        int x7 = queue.insertElementInQueue(7);
        System.out.println(queue);
        queue.removeElementFromQueue();
        int x8 = queue.insertElementInQueue(8);
        System.out.println(queue);
        queue.removeElementFromQueue();
        int x9 = queue.insertElementInQueue(9);
        System.out.println(queue);
        queue.removeElementFromQueue();
        int x10 =queue.insertElementInQueue(10);
        System.out.println(queue);
        queue.removeElementFromQueue();
        System.out.println(queue);
        int x11 =queue.insertElementInQueue(8);
        System.out.println(queue);
        */
        
        
        /**[B]**/
        int x1 = queue.insertElementInQueue(1);
        System.out.println(queue);
        queue.removeElementFromQueue();
        System.out.println(queue);
        int x2 = queue.insertElementInQueue(2);
        System.out.println(queue);
        queue.removeElementFromQueue();
        System.out.println(queue);
        int x3 = queue.insertElementInQueue(3);
        System.out.println(queue);
        
        int x4 = queue.insertElementInQueue(4);
        System.out.println(queue);
       
        int x5 = queue.insertElementInQueue(5);
        System.out.println(queue);
       
       
        int x6 = queue.insertElementInQueue(6);
        System.out.println(queue);
        queue.removeElementFromQueue();
        System.out.println(queue);
        int x7 = queue.insertElementInQueue(7);
        System.out.println(queue);
        queue.removeElementFromQueue();
        System.out.println(queue);
        int x8 = queue.insertElementInQueue(8);
        System.out.println(queue);
        
        int x9 = queue.insertElementInQueue(9);
        System.out.println(queue);
       
        int x10 =queue.insertElementInQueue(10);
        System.out.println(queue);
       
        //System.out.println(queue);
        int x11 =queue.insertElementInQueue(8);
        System.out.println(queue);
    }
}

