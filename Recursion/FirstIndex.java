package Recursion;

public class FirstIndex {

    public static int helper(int A[],int x,int startIndex){
             if (startIndex == A.length) {
            return -1;
        }

        if(A[startIndex] == x){
            return startIndex;
        }

        int intCheck = helper(A, x, startIndex+1);
        return intCheck;
    }
    public static void main(String[] args) {
        int A[] = {1,2,6,3,7,3};
        int x= 3;

        int isCheck = helper(A, x, 0);
        System.out.println(isCheck);
    }
}
