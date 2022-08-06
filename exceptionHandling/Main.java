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
