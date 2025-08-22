package Recursion;

public class Fibonacci {

    public static  int fibo(int n){
          // base case 
          if(n==1 || n==2){
            return 1;
          }
    
          // Hypothesis
           int fib_n_1 = fibo(n-1);
          int fib_n_2 = fibo(n-2);

         // recursive case || induction step ..
          int output = fib_n_1+fib_n_2;

          return output;
    }    public static void main(String[] args) {
        int n =6;

        System.out.print(fibo(n));
    }
}
