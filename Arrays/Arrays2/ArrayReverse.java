package Arrays.Arrays2;

import java.util.Scanner;

public class ArrayReverse {

  public static void swap(int Arr[],int l,int r){
       int temp = Arr[l];
        Arr[l] =Arr[r];
        Arr[r]= temp;
  }

    public static void reverse(int Arr[]){
         int l = 0;
         int r = Arr.length-1;
        
         while(l<r){
            swap(Arr,l,r);
            l++;
            r--;
         }
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the capacity of the array : ");
        int cap = s.nextInt();

        int Arr[] = new int[cap];

        for(int i=0;i<cap;i++){
            System.out.print("Enter the element at index "+ i+" " );
            Arr[i] = s.nextInt(); 
        }

        reverse(Arr);

        for(int i:Arr){
            System.out.print(i+ " ");
        }

    }
}
 