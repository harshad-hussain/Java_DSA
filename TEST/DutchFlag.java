package TEST;

import java.util.Scanner;

public class DutchFlag {
    public static void main(String[] args) {
        int A[] ={2,1,0,0,2,2,1,1,0,2,1,0,2};

        int zero =0;
        int i  = 0;
        int two = A.length-1;

        while(i<=two){
            if(A[i]==0){
                int temp = A[i];
                A[i] = A[zero];
                A[zero] = temp;
                zero++;
                i++;
            }
            else if (A[i]==1){
                i++;
            }
            else if(A[i]==2){
                int temp = A[i];
                A[i] = A[two];
                A[two] = temp;
                two--;
            }
        }

        for(int nums:A){
            System.out.print(nums);
        }


    }
}
