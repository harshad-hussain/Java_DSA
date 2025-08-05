package Arrays.Arrays1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int arr[]= new int[5];
        Scanner s = new Scanner(System.in);

        int sum = 0;

        for(int i=0;i<=arr.length-1;i++){
              System.out.println("Enter the values");
               arr[i] = s.nextInt();
         }

         for(int i:arr){
            sum = sum + i;
         }

         System.out.println("The sum of the array is " + sum);

    }
}
