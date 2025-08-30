package OOPs;

public class ComplexNumberUse {
    
    public static void main(String[] args) {
         ComplexNumber c1= new ComplexNumber(4, 6);
         ComplexNumber c2 = new ComplexNumber(3, -2);

         c1.print();
         c2.print();

         c1.add(c2);
         System.out.print( "After adding c2 to c1  ");
         c1.print();


         c1.multiply(c2);
         System.out.print("After multiplying c1 with c2  ");
         c1.print();
    }

    
   

}
