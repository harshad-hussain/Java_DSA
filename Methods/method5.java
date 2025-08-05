package Methods;

public class method5 {
    
      public static void printDetails(String name,String dob,long accountNum){
        System.out.println("Name :" + name );
        System.out.println("D.O.B :" + dob);
        System.out.println( "AccountNum :" + accountNum);
      }
      
       public static void main(String[] args) {
        
        printDetails("Harshad", "18.03.2002", 88787698776896l);
        printDetails("Hussain","18.06.2002",5678909876l);

       }

}
