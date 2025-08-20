package Recursion;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class printNatural {

    public static void print(int n){
        if(n==0){
            return;
        }

        print(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : " );
        int n = s.nextInt();

        print(n);
    }
}
