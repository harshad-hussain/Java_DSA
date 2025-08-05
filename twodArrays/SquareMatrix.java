package twodArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SquareMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     int rows = 3;
     int cols =3;

     int Arr[][] = new int[rows][cols];

     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
             System.out.print("Enter the elements at  Arr[" + i + " ] ["+j+"]" );
            Arr[i][j] = s.nextInt();
        }
     }

     if(rows==cols){
        int diag[] = new int[rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols ;j++){
                if(i==j){
                    diag[i] = Arr[i][j];
                }
            }
        }
        System.out.println("Diagonal elements: " + Arrays.toString(diag));
        System.out.println("YES");
     }
     else{
     System.out.println("NO");
     }

     
    }
}
