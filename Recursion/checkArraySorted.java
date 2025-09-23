package Recursion;

public class checkArraySorted {

    public static boolean helper(int A[],int startIndex){
          if(startIndex == A.length-1){
            return true;
          }
          if(A[startIndex]>A[startIndex+1]){
            return false;           
          }
          boolean isSorted = helper(A,startIndex+1);
          return isSorted;
        }
      public static void main(String[] args) {
        int startIndex =0;

        int A[] = {1,2,0,5,7};

        boolean sample = helper(A,startIndex);

        System.out.print(sample);
    }
}
