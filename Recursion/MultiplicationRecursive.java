package Recursion;

public class MultiplicationRecursive {
    public static int mul(int n , int m){
         if(n==0){
            return 0;
         }

         int ans = m +mul(n-1,m);
         return ans;
    }
    public static void main(String[] args) {
        int result = mul(4, 6);
        System.out.print(result);
    }
}
