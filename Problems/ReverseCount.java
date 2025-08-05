package Problems;

import java.util.Scanner;

public class ReverseCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for(int i=num;i>= 1;i--){
            System.out.print(i+ " ");
        }
        
    }
}
