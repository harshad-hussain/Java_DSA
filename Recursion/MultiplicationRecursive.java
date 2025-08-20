package Recursion;

public class MultiplicationRecursive {
    public static int mul(int n , int m){
         if(n==0){
            return 0;
         }

         int total = m + mul(m,n-1);
         return total;
    }
    public static void main(String[] args) {
        int result = mul(4, 6);
        System.out.print(result);
    }
}
