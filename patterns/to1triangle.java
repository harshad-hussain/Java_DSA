package patterns;

import java.util.Scanner;

public class to1triangle {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int N = s.nextInt();

         int start =1;
         for(int i =1;i<=N;i++){
            if(i%2==0) start =0;
            else start=1;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println(" ");

         }
    }
    

}
