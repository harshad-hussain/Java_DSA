package Methods;

import java.util.Scanner;

public class method4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();


        if(n<0 || r<0){
            System.out.println("Not a valid number");
            return;
        }

        int factN = Factorial(n);
        int factR = Factorial(r);

        int factNR = Factorial(n-r);

        int combination = factN/(factR*factNR);


        System.out.println(combination);
        
    }

    public static int Factorial(int num){
        int facto =1;

        for(int i=1;i<=num;i++){
             facto  = facto*i;  
    }
    return facto;
}


}
