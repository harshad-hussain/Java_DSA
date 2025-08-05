package Methods;

public class method1 {

      public static void printDetails(String name,String dob,long accountNum){
        System.out.println("Name :" + name );
        System.out.println("D.O.B :" + dob);
        System.out.println( "AccountNum :" + accountNum);
        System.out.println("Balance :" + Balance(80000.5, 40000.4, 25000.5)  );
      }
      
      public static double Balance(double currentBalance,double credit,double debit){
        return currentBalance+ credit-debit;
      } 


       public static void main(String[] args) {
        
        printDetails("Harshad", "18.03.2002", 88787698776896l);
        
       }
}
