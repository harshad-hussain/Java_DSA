package patterns;

import java.util.Scanner;

public class CharacterPyramid {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
           
        for(int i=1;i<=N;i++){
            for(int j=N;j>=i;j--){
                 System.out.print(" ");
            }

            char jthchar = (char)('A');

            for(int k=N/2;k<=i;k++){
                System.out.print(jthchar);
                jthchar++;
            }

            char second = (char)(jthchar-2);
                      

            for(int k=N/2;k<=i-1;k++){
                System.out.print(second);
                second--;
            }

            System.out.println();
            
        }
    }
}
