package Problems;

import java.util.Scanner;

public class Squares {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number!");
        int num = s.nextInt();
        
   for(int i =1 ; i<=num;i++){
      int square = i*i;
      System.out.println(square);
    }
            
     }
}
