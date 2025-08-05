package Strings;

import java.util.Scanner;

public class wordCount2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        
        String st[] = str.split((" "));

        System.out.println(" total words in the string is " +st.length);

    }
}
