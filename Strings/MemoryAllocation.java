package Strings;

public class MemoryAllocation {
     public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        String s3 = "Java";

        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = new String("java");

        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s3 == s2);

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
         System.out.println(System.identityHashCode(str1));
          System.out.println(System.identityHashCode(str2));
           System.out.println(System.identityHashCode(str3));
     }
}
