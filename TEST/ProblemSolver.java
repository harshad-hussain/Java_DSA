package TEST;

import java.util.Scanner;

import Problems.even;
import SearchingndSorting.linearSearch;

public class ProblemSolver {

   

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int Arr[][] = {{3,6,2,5},
                       {6,9,3,5},
                       {1,5,3,6}};
     
        int left = 0;
        int top=0;
        int right = Arr.length-1;
        int bottom = Arr[0].length-1;

        while(left<=right && top<=bottom ){

            for(int i=left;i<=right;i++){
                System.out.print(Arr[top][left]);
                top++;
            }
            for(int i=top;i<=bottom;i++){
                System.out.print(Arr[i][right]);
                right--;
            }
            
        }






              
        
       

        
    }
}
