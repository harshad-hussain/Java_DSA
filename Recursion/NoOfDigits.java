package Recursion;

import SearchingndSorting.linearSearch;
import patterns.diamond;

public class NoOfDigits {

    public static int digit(int n){
        if(n==0){
            return 0;
        }
        int count =0;
        count = 1+ digit(n/ 10);
        return count;
    }

    public static void main(String[] args) {
        System.out.print(digit(123));
    }
}
