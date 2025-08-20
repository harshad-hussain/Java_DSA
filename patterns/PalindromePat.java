package patterns;

import java.util.Scanner;

public class PalindromePat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            int num=i;      
            for(int k=1;k<=i;k++){
                    System.out.print(num);
                        num++;
            } 
              for(int m= i-1;m>=1;m--){
                System.out.print(m);
              } 
            System.out.println();
        }
        
    }
}
