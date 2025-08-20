package Recursion;

public class sumofn {

    public static int sumn(int n){
        if(n==0){
            return 0;
        }

        int smallOutput = sumn(n-1);
        int total = n+smallOutput;
        return total;
    }
    public static void main(String[] args) {
         System.out.print(sumn(5));
    }
}
