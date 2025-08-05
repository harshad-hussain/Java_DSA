package Arrays.Arrays1;

import java.util.Scanner;

public class ArrayUser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
           int arr[] = new int[5];

           for(int i=0;i<=arr.length-1;i++){
                System.out.print("Enter the value of "+ i + " index :");
                  arr[i]= sc.nextInt();
           }

           for(int i:arr){
            System.out.print( i + " ");
           }

        
    }
}
