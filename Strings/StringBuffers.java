package Strings;

public class StringBuffers {
    public static void main(String[] args) {
        
        String str = "Java";
        System.out.println(str + " ");
        System.out.println(System.identityHashCode(str));
        str = str+"Program";
        System.out.println(str);
        System.out.println(System.identityHashCode(str));

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(System.identityHashCode(sb));
        sb.append("World");
        System.out.println(System.identityHashCode(sb));


    }
}
