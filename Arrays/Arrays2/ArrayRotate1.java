package Arrays.Arrays2;

import java.util.Scanner;

public class ArrayRotate1 {
          public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.print("Enter the size of the array : ");
          int size = s.nextInt();
          int Arr[]= new int[size];
        
          int B[] = new int[size];
        
           for(int i =0;i<size;i++){
                    System.out.print("Enter the element at "+ i + "index :");
           Arr[i] = s.nextInt();
          }

          System.out.print("Enter '1' to rotate right and '0' to rotate left" );
          int dir = s.nextInt();

          System.out.print("Enter numberof rotation");
          int x = s.nextInt();


          if(dir == 1){
            for(int i=0;i<size;i++){
               B[(i+x) % size] = Arr[i];
            }
          }
          else{
            for(int i=0;i<size;i++){
                B[(i-x+size) % size] = Arr[i];
            }
          }
          for(int i:Arr){
            System.out.print( i + " ");
          }

          System.out.println();
          for(int i:B){
            System.out.print(i + " ");
          }
       }
}
