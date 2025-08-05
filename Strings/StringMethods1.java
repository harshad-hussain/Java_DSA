package Strings;

public class StringMethods1 {
    public static void main(String[] args) {
        String s1 = "Coding ninjas";
        
        //length
        System.out.println(s1.length());

        //charAt()
        System.out.println(s1.charAt(6));

        //trim()
        System.out.println(s1.trim());

        //subString()
        System.out.println(s1.substring( 7));
        System.out.println(s1.substring(4,10));

        //replace()
        System.out.println(s1.replace('n', '@'));

        //indexOf()
        System.out.println(s1.indexOf("ni", 5));

        //lastIndexOf()
        System.out.println(s1.lastIndexOf("ja"));

        //equals()
        String n1 = "Hello";
        String n2 = new String("hello");

        System.out.println(n1.equals(n2));

        //Compare ()
         System.out.println(n1.compareTo(n2));



    }

}
