package collectionFramework;

import java.util.Stack;

public class StackInJava {

    public static void main(String args[]){

        Stack<Integer> arr = new Stack<>();

        arr.push(10);
        arr.push(20);
        arr.push(30);
        arr.push(40);
        arr.push(50);

        
        // This will give you peek element form the stack
        int x = arr.pop();
        System.out.println(x);
        System.out.println(arr.peek());

        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }


    }
    
}
