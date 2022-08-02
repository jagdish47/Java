package String;

public class FrequencyOfString {
    public static void main(String[] args) {

        String str = "aabbcdefxxx";
        frequency(str);

    }

    static void frequency(String str) {
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            // Typecasting character to int which give us ascii value
            int x = str.charAt(i);
            int index = x - 97;
            arr[index]++;
        }


        for (int i = 0; i < 26; i++) {
            int ascii = i + 97;
            // Typecasting Integer to Character back
            char ch = (char)ascii;

            if (arr[i] != 0) {
                System.out.println(ch + " : " + arr[i]);

            }
        }
    }
}
