package Recursion;

public class CheckLastIndex {

    public static int checker(int A[],int x,int startIndex){
        if(startIndex == A.length-1){
            return -1;
        }

        int search = checker(A, x, startIndex+1);

        if(search != -1){
            return  search;
        }

        if(A[startIndex]  ==x){
            return startIndex;
        }

        return -1;
    }
    public static void main(String[] args) {
         int A[] = {1,7,2,8,7,9};
         int x = 7;
         int startIndex =0;

         int samp = checker(A, x, startIndex);
         System.out.print(samp);
    }
}
