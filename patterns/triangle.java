package patterns;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N= s.nextInt();

           for(int i=N;i>=1;i--){

              for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=N;k++){
                System.out.print("*" + " ");
             }
            System.out.println();
        }
    }
}
