package Problems;

import java.util.Scanner;

public class forLoop3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum =0;
        for(int i =0 ;i<=20;i++ ){
            sum = sum + i;
        }
        System.out.println(sum);
    
    }

}
