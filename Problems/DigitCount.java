package Problems;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count =0;
     
        if(num==0){
            count=1;
        }else{
            while(num>0){
                    count++;
                    num = num/10;
            }
        }

        System.out.println("Count " + count);
    
    }

}
