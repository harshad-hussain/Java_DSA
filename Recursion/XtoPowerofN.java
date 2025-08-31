package Recursion;

public class XtoPowerofN {

    public static int sol(int x, int n){
        if(n==0){
            return 1;
        }
            int total = x * sol(x , n-1);
            return total;
    }
    public static void main(String[] args) {
        int n = 4;
        int x= 4;
        System.out.print(sol(4, 4));
        
    }
}
