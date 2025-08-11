package Methods;

public class method_Overload {
    // two rules should be used in method overloading  
    // 1. Parameters should be different .
    //2. the data type should be different.

    public static void sum(int a ,int b){
        System.out.println(a+b);
    }

    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        sum(2,4);
        sum(3,2,5);
        sum(4,545.3);
    }
}
