package Methods;

import java.util.Scanner;

public class method3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int addition = add(a,b,c);
        System.out.println(addition);
        
    }

    public static int add(int a,int b,int c){
        int sum = a+b+c;
        return sum; 
    }
}
