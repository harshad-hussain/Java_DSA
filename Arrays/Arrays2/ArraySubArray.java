package Arrays.Arrays2;

import java.util.Scanner;


public class ArraySubArray {


    public static void swap(int A[],int l,int r){
              int temp = A[l];
              A[l]= A[r];
              A[r] = temp;
    }

    public static void reverse(int A[]){
        Scanner s = new Scanner(System.in);
        
           System.out.print("Enter the index from left :");
           int l =s.nextInt();
           
           System.out.print("Enter the index from right :");
           int r= s.nextInt();

           while (l<r) {
             
            swap(A, l, r);
            l++;
            r--;
           }

    }

      public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the size of the array :");
         int size = s.nextInt();

        int A[] = new int[size];
        
        for(int i =0;i<size;i++){
            System.out.print("Enter the element at "+ i + "index : ");
            A[i] = s.nextInt();
        }

        reverse(A);

            
        for(int i:A){
            System.out.print(i);
        }
      }
}
