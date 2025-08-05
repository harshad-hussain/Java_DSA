package Strings;

import java.util.Scanner;

public class ConsecutiveDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sb = s.nextLine();

        String unique= "" +sb.charAt(0);

        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i) !=sb.charAt(i-1)){
                unique += sb.charAt(i);
            }
        }

        System.out.println(unique);
        
    }
}
