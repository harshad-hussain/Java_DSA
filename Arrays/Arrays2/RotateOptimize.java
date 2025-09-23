package Arrays.Arrays2;

import java.util.Scanner;

public class RotateOptimize {

    public static void reverse(int Arr[] , int l, int r){
          
        while(l<r){
            int temp = Arr[l];
            Arr[l]= Arr[r];
            Arr[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the length of the array");
        int length  = s.nextInt();

        int Arr[] = new int[length];

        for(int i=0;i<length;i++){
            System.out.print("enter the element at " + i + " index : ");
            Arr[i] = s.nextInt();
        }
        System.out.println("Enter '1' to rotate right  and '0'  to rotate left : ");
         int dir = s.nextInt();
         System.out.println("Enter the number of rotations : ");
         int x = s.nextInt();

         if(dir ==1){
                 reverse(Arr, 0, length-1);
                 reverse(Arr,0,x-1);
                 reverse(Arr, x, length-1);
         }else{
               reverse(Arr, 0, length-1);
               reverse(Arr, 0, length-x-1);
               reverse(Arr, length-x, length-1);
         }
             
         for(int i:Arr){
            System.out.print(i + " ");
         }

        
    }
}
