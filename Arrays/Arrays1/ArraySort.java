package Arrays.Arrays1;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<size;i++){
             arr[i] = s.nextInt();
        }

        int nextZero = 0;                                               

        for(int i=0;i<size;i++){
               if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[nextZero];
                arr[nextZero] = temp;
                nextZero++;
               }
        }

        for(int i:arr){
            System.out.print( i+ " "); 
        }

    }
}
