package Recursion;

public class returnIndex {

    public static int isCheck(int A[],int x, int startIndex){
        if(startIndex == A.length){
            return -1;
        }

         if (A[startIndex] == x) {
            return startIndex;
        }

    
        return isCheck(A, x, startIndex + 1);
    }
    public static void main(String[] args) {
        int A[]={1,5,3,7,3,7,2};
           int index = isCheck(A, 7, 0);
              System.out.print(index);
    }
}
