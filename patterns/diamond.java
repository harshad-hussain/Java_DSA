package patterns;
import java.util.Scanner;

public class diamond {
    


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N= s.nextInt();
               
               for(int i =1;i<=N;i++){
                   
                   for(int j=N;j>=i;j--){
                       System.out.print(" ");
                   }
                   
                   for(int k=1;k<=i;k++){
                       System.out.print("*" + " ");
                   }
                   
                    System.out.println();
               }

                 for(int i =N-1;i>=1;i--){
                   
                   for(int j=N;j>=i;j--){
                       System.out.print(" ");
                   }
                   
                   for(int k=1;k<=i;k++){
                       System.out.print("*" + " ");
                   }
                   
                    System.out.println();
               }

           
        }
}




