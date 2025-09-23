package Recursion;

import java.util.Arrays;

public class allIndexes {

    public static int[] helper(int A[],int x,int startIndex){
                       
        if(startIndex == A.length) {
            return new int[0];
        }              
                             
        int empty[] = helper(A, x, startIndex+1);
                                             
        if(A[startIndex]==x){                     
            int output[] = new int[empty.length+1];        
            output[0] = startIndex;                   
            for(int i=0;i< empty.length;i++){                            
                output[i+1] = empty[i];                                 
            }                                                                      
            return output;                           
        }                                          
        return empty;                                                   
    }
    public static void main(String[] args) {
        int A[]= {1,5,2,6,5,5,7,3,5};

         int[] result = helper(A, 5, 0);
         System.out.println(Arrays.toString(result));
    }
}
