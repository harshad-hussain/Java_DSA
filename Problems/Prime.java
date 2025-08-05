package Problems;

import java.util.Scanner;

public class Prime {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int n = s.nextInt();
        boolean isflag = false;
        
        for(int i=2;i<n;i++){
              if(n%i==0){
                isflag = true;
                break;
              }
        }

        if(isflag == false){
            System.out.println(n + " is a prime number ");
        }
        else{
            System.out.println(n+ " is not a prime number");
        }
     }
}
