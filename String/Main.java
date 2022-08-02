package String;

import java.util.Scanner;

class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Two ways to declare string
        // String name1 = "Jagdish Kumawat";
        // String name2 = new String("Anshu Kumawat");

        // System.out.println(name1);
        // System.out.println(name2);

        // Java String doesn't support this
        // System.out.println(name1[0]);
        // System.out.println(name1[2]);
        // System.out.println(name1[8]);
        // System.out.println(name1[7]);

        // accessing string
        // System.out.println(name1.charAt(0));
        // System.out.println(name1.charAt(2));

        // won't allow because string are immutable and we can't change string
        // name1.charAt(0) = "X";

        // we can't change modify the string but we can add to existing string
        // System.out.println(name1 + " Jassii");
        // System.out.println(name1);

        // String name = "JagdishKumawat";
        // System.out.println(name.substring(2, 5+1));
        // System.out.println(name.substring(5));

        // Taking input form user as a string
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);




        // Taking string inside array accessing and printing
 
        String[] names = new String[5];

        try (Scanner inp = new Scanner(System.in)) {
            for(int i = 0; i < names.length; i++){
                names[i] = inp.next();
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}