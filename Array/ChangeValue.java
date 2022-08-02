package Array;

// import java.lang.ref.Reference;

public class ChangeValue {
    public static void main(String[] args) {
        
        // int x = 5;
        // System.out.println(x);
        // x = increment(x);
        // System.out.println(x);


        // Here is changed because array is passed by value not Reference there is no such word(Reference) in Java.
        int[] arr = new int[5];
        changeArray(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

    static void changeArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }

    // public static int increment(int a){
    //     a = a+1;
    //     return a;
    // }
}
