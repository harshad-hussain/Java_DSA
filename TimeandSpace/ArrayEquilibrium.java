package TimeandSpace;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEquilibrium {

    public static int equilibrium(int[] Arr){
       int leftsum =0;
    int total =0;

    for(int num:Arr){
        total += num;
    }

    for(int i=0;i<Arr.length;i++){
        int rightsum = total-leftsum -Arr[i];
        if(rightsum ==leftsum){
            return i;
        }
        leftsum += Arr[i];
    }

    return -1;

    }
    public static void main(String[] args) {
        
    int Arr[] ={2,3,10,-10,4,2,9};

    int result = equilibrium(Arr);
    System.out.print(result);

   
    }
}
