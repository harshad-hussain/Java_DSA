package Arrays.Arrays2;

import java.util.Scanner;

public class ArrayZero {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = s.nextInt();
       
        int Arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the value at "+ i + "index : " );
            Arr[i] = s.nextInt();
        }

        int zero =0;
 
        for(int i =0;i<size;i++){
             if(Arr[i]!=0){
                int temp = Arr[i];
                Arr[i] = Arr[zero];
                Arr[zero]  = temp;
                zero++;
             }
        }

        for(int i:Arr){
            System.out.print(i+ " ");
        }


     }
}
