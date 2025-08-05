package Problems;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
           int num = 5;

         for(int i = 1 ; i<=10;i++){
            System.out.println( num +"*"+ i +  "="  + (num*i));
         }
    }
}
