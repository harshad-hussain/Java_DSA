import java.util.Scanner;

class Example{

    public static void Main(String[] args){

        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if(age > 18 && age< 60){
            System.out.println(" age is correct");
        }
    }

}