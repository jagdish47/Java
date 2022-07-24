package String;


public class StringBuilderBasic {
    public static void main(String[] args){

        StringBuilder str = new StringBuilder("Jagdish Kumawat");

        System.out.println(str);

        str.append(" From");
        str.insert(5," How are you");
        System.out.println(str);




    }
}
