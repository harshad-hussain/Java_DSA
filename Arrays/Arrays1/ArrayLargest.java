package Arrays.Arrays1;

import java.util.Scanner;

public class ArrayLargest {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size for the array");
        int size = s.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<=size-1;i++){
            arr[i] = s.nextInt();
             System.out.println("Enter the elements for the array");
        }
         int max = arr[0];

         for(int i=1;i<=size-1;i++){
             if(max <arr[i]){
                 max = arr[i];         
             }
        }

        System.out.println("The maximum value in the array is :" + max);




        
     }
}
