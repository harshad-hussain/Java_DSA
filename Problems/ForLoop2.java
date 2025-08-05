package Problems;

import java.util.Scanner;

public class ForLoop2 {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = s.nextInt();

        for(int i =1 ; i<= num;i++){
            System.out.println(i);
        }
        
      }
}
