package exceptionHandling;

public class Main {
    public static void main(String[] args){

        try{
            System.out.println(fact(-5));
            System.out.println(divide(4, 0));

            int[] arr = new int[0];
            System.out.println(arr[1]);
        }

        catch(LessThanZeroException e){
            System.out.println(e);
        }
        catch(divideByZeroException f){

            System.out.println(f);

        }

        catch(Exception m){
            // if other exception will occure than this will handle them
            System.out.println(m);
        }

        finally{

        }

    }

    public static int divide(int a, int b) throws divideByZeroException{
        if(b == 0){
            throw new divideByZeroException();
        }
        return a/b;
    }

    public static int fact(int n) throws LessThanZeroException{
        if(n < 0){
            throw new LessThanZeroException();
        }

        int ans = 1;

        while(n != 1){
            ans = ans * n;
            n--;
        }
        return ans;

    }




}




//1. Try block
// Java try block is used to enclose the code that might throw an exception. It must be used within the method. 


// 2. CATCH block
// Java catch block is used to handle the Exception by declaring the type of exception within the parameter. The declared exception must be the parent class exception ( i.e., Exception) or the generated exception type. However, the good approach is to declare the generated type of exception.


// 3. FINALLY block
// Java finally block is always executed whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.


// 4.THROW Keyword
// The Java throw keyword is used to throw an exception explicitly.
// We specify the exception object which is to be thrown. The Exception has some message with it that provides the error description. These exceptions may be related to user inputs, server, etc.


// 5. THROWS keyword
// The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception. So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.