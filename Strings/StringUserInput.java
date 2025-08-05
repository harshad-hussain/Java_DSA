package Strings;

import java.util.Scanner;

public class StringUserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        s.nextLine();
    
        String str2 = s.nextLine();

        System.out.println(str);
        System.out.println(str2);
    }
}
