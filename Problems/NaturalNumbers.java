package Problems;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
    int a = 1;
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int sum =0; 

    for(int i=1;i<=num;i++){
        sum = sum+i;
    }
     System.out.println(sum);
    }
}
