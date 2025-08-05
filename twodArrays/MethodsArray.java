package twodArrays;

import java.util.Scanner;

public class MethodsArray {

    public static int[][] takeInput(){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = s.nextInt();

        System.out.print("Enter no of rows: ");
        int cols = s.nextInt();

        int A[][]= new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                A[i][j]= s.nextInt();
            }
        }
        s.close();

        return A;
    }

    public static void printDetails(int A[][]){
       int n= A.length;
       int m = A[0].length;

       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(A[i][j]+ " ");
        }
        System.out.println();
       }
    }

    public static void main(String[] args) {
        

        int A[][]= takeInput();
        printDetails(A);


    }
}
