package collectionFramework;
import java.util.*;

public class Main {

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        // List<Integer> arr = new ArrayList<>()
        // Object of arrayList

        arr.add(5);
        arr.add(10);
        arr.add(15);
        // How to add element to a particular index
        arr.add(1, 2);

        // if you want to change the element to particular index
        arr.set(1, 10);


        System.out.println(arr.size());
        // size of arrayList

        // using get() method you can get the arrayList elements
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        arr.remove(1);
        // remove element using remove() method in arrayList

    }
}


// arraylist is a dynamic array
// you can add as element you want
// Asychronous


// Vector and arrayList are same 
// Vector is sychnounus


// Vector is slower than arraList
// so instead of vector we use ArrayList