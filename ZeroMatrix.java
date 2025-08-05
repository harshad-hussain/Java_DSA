package twodArrays;

import java.util.Scanner;

public class ZeroMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows ");
        int rows = s.nextInt();

        System.out.print("Enter the columns");
        int columns = s.nextInt();

        int Arr[][] = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter the elements at  Arr[" + i + " ] ["+j+"]");
                Arr[i][j] = s.nextInt();
            }
        }

        boolean rowZero[]= new boolean[rows];
        boolean colsZero[] = new boolean[columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                 if(Arr[i][j]==0){
                    rowZero[i]= true;
                    colsZero[j]= true;
                 }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(rowZero[i] || colsZero[j]){
                    Arr[i][j] = 0;
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(Arr[i][j]+ " ");
            }
            System.out.println();
        }



    }
}
