package Methods;

public class method2 {
    public static void main(String[] args) {
         int sq2= squared(5);
         int sq3= squared(10);
         System.out.println(sq2);
         System.out.println(sq3);
    }

    public static int squared(int a){
        int sq = a*a;
        return sq;
    }
}

