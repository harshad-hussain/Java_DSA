package Methods;

import java.util.Scanner;

public class Prime_method {

    public static boolean isPrime(int n){
        
        for(int i=2;i<=n/2;i++){

            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int limit){
              
        for(int i=2;i<=limit;i++){

            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
            
        printPrime(n);
        
    }
}
