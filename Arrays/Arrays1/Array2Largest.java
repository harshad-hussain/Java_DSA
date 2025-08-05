package Arrays.Arrays1;

import java.util.Scanner;

public class Array2Largest {
    public static void main(String[] args) {
        
         Scanner s = new Scanner(System.in);
         
         System.out.println("Enter the size");
         int size = s.nextInt();

         int arr[] = new int[size];

         int Largest = arr[0];
         int secondLargest = 0;

         for(int i=0;i<=size-1;i++){
            System.out.print("Enter the element : " );
           arr[i] = s.nextInt();
         }

         for(int j=0;j<arr.length;j++){
              if(arr[j]>Largest){
                  secondLargest = Largest;
                  Largest = arr[j];
                  arr[j] = Integer.MIN_VALUE;
              }
              else if(arr[j]>secondLargest && arr[j]!=Largest){
                secondLargest = arr[j];
              }
         }

         System.out.println("The second largest element is " + secondLargest);

     
    }
}
