package twodArrays;

import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int row = s.nextInt();
        int col = s.nextInt();
        
        int Arr[][] = new int[row][col];

        // Taking user input into the 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Arr[i][j] = s.nextInt();
            }
        }

        // Call the method to print
        PrintArray(Arr);
    }

    public static void PrintArray(int Arr[][]) {
        for (int[] i : Arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
