package patterns;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++){  
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=N;k++){
                System.out.print(k + " ");
             }
            System.out.println();
        }

        for(int i=N-1;i>=1;i--){

              for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }

            for(int k=i;k<=N;k++){
                System.out.print(k + " ");
             }
             
            System.out.println();
        }
    }
}
