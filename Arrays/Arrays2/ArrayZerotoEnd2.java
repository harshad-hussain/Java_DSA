package Arrays.Arrays2;

import java.util.Scanner;

public class ArrayZerotoEnd2 {
    public static void swap(int Arr[],int i,int Zero){
       int temp = Arr[i];
        Arr[i] = Arr[Zero];  
        Arr[Zero] = temp; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = s.nextInt();
         
        int Arr[] = new int[size];
        
        for(int i =0;i<size;i++){
            System.out.print("Enter the element at"         + i +  "index : ");
            Arr[i] = s.nextInt();
        }
           int Zero =0 ; 
        for(int i=0;i<size;i++){
            if(Arr[i]!=0){
              swap(Arr,i,Zero);
              Zero++;
            }
    }
        System.out.print("Final Array: ");
        for (int i : Arr) {
            System.out.print(i + " ");
        }

    }
}
