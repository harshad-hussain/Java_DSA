package Strings;

public class StringCreation {
    public static void main(String[] args) {
        String  a = "Hi buddy";

        // 1. passing string literal 
        String str = new String("Coding");

        // 2.Passing Character Array
         char ch[] = {'a','b','c','d'};
         String str2 = new String(ch);

         //3. Passing byte array
         byte b[] = {97,32,45,6};
         String str3 = new String(b);

         System.out.println(str);
         System.out.println(str2);
         System.out.println(str3);

    }
}
