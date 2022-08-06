package exceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args) {

        // int x = 5 / 0;

        // System.out.println(x);
        // System.out.println("How are you");

        for(int i = 0; i < 5; i++){

            try{
               System.out.println(divide(5,i));

            }
            catch(Exception divideByZeroException){
                System.out.println("You can't divide something with zero");
            }
        }

    }

    // public static int divide(int a, int b){
    //     return a/b;
    // }

    public static int divide(int a, int b) throws divideByZeroException{
        if(b == 0){
            throw new divideByZeroException();
        }

        return a/b; 
    }
}
