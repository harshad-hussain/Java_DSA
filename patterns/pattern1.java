package patterns;

import java.util.Scanner;

public class pattern1 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n= s.nextInt();

            int p=1;
            for(int i=1;i<=n;i++){
            
                 for(int j=1;j<=i;j++ ){
                    System.out.print(p + " ");
                    p++;
                 }
                 System.out.println(" ");
            }
        }
}
