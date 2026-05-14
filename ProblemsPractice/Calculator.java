public class Calculator {
    
    int a;
    int b;
    int c;

    // Calculator(int a,int b, int c){
    //     this.a =a;
    //     this.b=b;
    //     this.c=c;
    // }

    public int multiply(int a,int b){
        return a*b;
    }

    public int multiply(int a,int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        Calculator c1= new Calculator();

        System.out.println(c1.multiply(5, 10));
        System.out.println(c1.multiply(5, 10, 2));

        
    }
}
