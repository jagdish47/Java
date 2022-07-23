package Array;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 2, 2, 5 };
        duplicateElement(arr);

    }

    static void duplicateElement(int[] arr) {

      int count = 1;
      int x = arr[0];


      for(int i = 1; i < arr.length; i++){

        if(arr[i] == x){
            count++;
        }
        else{
            if(count > 1){
                System.out.println(x);
            }
            x = arr[i];
            count=1;
        }
      }

      if(count > 1){
        System.out.println(x);
      }

    }
}
