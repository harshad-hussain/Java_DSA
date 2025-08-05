package Lessons;
public class Implicit {
     public static void main(String[] args) {
        byte age = 30;
        short year = 2030;

        short birthYear = (short)(year-age);
        System.out.println(birthYear);
     }
}
