package OOPs2;

public class ManUse {
    public static void main(String[] args) {
          Man m = new son(18);
          Man m2= new Man();

          son s= (son)m; // this is class cast exception will come we are explicitly declaring the derived class object to super class

        //   Object o = new Vehicle(); //object class is super class of all the derived classes 
          
          m.print();
          m2.print();   

    }
 
  

}
