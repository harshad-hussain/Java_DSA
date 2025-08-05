package Problems;
import java.util.Scanner;
public class StudentGrade {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
               System.out.println("Enter the Marks");
               double marks = sc.nextInt();

              System.out.println("Enter the GPa");
              double Gpa =  sc.nextFloat();

              System.out.println("Enter the no of Stars");
              int stars = sc.nextInt();

              if(marks >=65 && (Gpa >= 3.5 || stars >=3) ){
                System.out.println("He is eligible ");
              }else{
                System.out.println("OOps ! you are not eligible");
              }
         }
}
