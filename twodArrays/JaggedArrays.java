package twodArrays;

import java.util.Scanner;

public class JaggedArrays {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter no of rows");
    int rows = s.nextInt();

    int Arr[][] = new int[rows][];

    for(int i=0;i<rows;i++){
        System.out.print("Enter the no of columns for the row");
        int cols = s.nextInt();
       
        Arr[i] = new int[cols];

        for(int j=0;j< cols;j++){
            System.out.print("Enter element at [" + i + "][" + j + "]: ");
            Arr[i][j] = s.nextInt(); 
        }
    }

    // System.out.print("Enter no of columns for" + 0 + "th array");
    // Arr[0]= new int[col]; 
    // System.out.print("Enter no of columns for" + 1 + "th array");
    // Arr[1]= new int[col];
    // System.out.print("Enter no of columns for" + 2 + "th array");
    // Arr[2] = new int[col];

    
    for(int i=0;i<Arr.length;i++){
        for(int j=0;j<Arr[i].length;j++){
           System.out.print(Arr[i][j]);
        }
        System.out.println();
    }
 }   
}
