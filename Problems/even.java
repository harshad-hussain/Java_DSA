package Problems;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        
         Scanner s = new Scanner(System.in);
         System.out.println("Please enter the number");
      int num = s.nextInt();
      
      for(int i =1 ;i<=num;i++){
          if(i%2==0){
              System.out.println(i);
          }
    }
}
}
