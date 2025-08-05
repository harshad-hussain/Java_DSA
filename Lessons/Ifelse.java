package Lessons;
import java.util.Scanner;

public class Ifelse {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int marks = sc.nextInt();

           if(marks >=70 && marks <80){
            System.out.println("B Grade");
           }
           else if(marks >=80 && marks <90){
            System.out.println("A Grade");
           }
           else if(marks >90){
            System.out.println("A+ Grade");
           }

       }
}
