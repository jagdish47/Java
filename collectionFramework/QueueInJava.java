package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;


public class QueueInJava {
    
    public static void main(String args[]){

        Queue<Integer> arr = new PriorityQueue<>();

        arr.add(5);
        arr.add(4);
        arr.add(3);
        
        System.out.println(arr.peek());
        System.out.println(arr.size());

        int x = arr.remove();
        System.out.println(x);

        
    }
}


// This is min priority Queue minimum element will give the priority