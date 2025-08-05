package patterns;

import java.util.Scanner;

import Problems.forloop;

public class Diamond2 {

    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    for(int i = 1 ;i<=n;i++){

       for(int j=1;j <= n-i;j++){
        System.out.print(' ');
       }

       for(int k=1;k<=2*i-1;k++){
        System.out.print("*");
       }

    System.out.println(" ");
} 

  for(int i = n - 1; i >= 1; i--) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

}
}




        //    harshad2002@gmail.com

        //  /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

        //  8870355953
        //  887 035 5953
        //  /^(\d{3})[- ]?(\d{3})[- ]?(\d{4})$/
