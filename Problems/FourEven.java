package Problems;

import java.util.Scanner;

public class FourEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j =4;
        
          for(int i = 1;i<=n;i++){
            if(i%2==0){
                if(j>0){
               System.out.println(i);
               j--;
                }
            }
          }

    }
}
