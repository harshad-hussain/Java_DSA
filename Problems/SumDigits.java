package Problems;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
       int temp =0;

        for(int i=num;i>=0;i--){
           int ld = num%10;
            temp = temp +ld;
            num = num/10;
        }
        System.out.println(temp);
    }
}
