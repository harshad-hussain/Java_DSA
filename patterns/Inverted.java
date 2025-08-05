package patterns;

import java.util.Scanner;

public class Inverted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
         
        for(int i=1;i<=N;i++){
               for(int j=1;j<=N-i+1;j++){
                System.out.print("*");
               }
               System.out.println("");
        }
    }
}
