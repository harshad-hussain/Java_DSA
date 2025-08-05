package Lessons;
public class Operators {
    public static void main(String[] args) {
        //Assignment operators - left to right 
        int i =10;
        int j=i;
        int k =i= 100;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        //Arithmetic  operators(+,-,*,/,%)
        System.out.println(100+20);
        System.out.println(100-20);
        System.out.println(100*20);
        System.out.println(100/20);
        
        //Augmented Assignment 
        int num = 3;
        num = num +3;
        System.out.println(num);

    }
}
