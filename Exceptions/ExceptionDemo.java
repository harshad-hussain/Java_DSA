package Exceptions;

public class ExceptionDemo {

    public static int divide(int a ,int b) throws DividebyZeroException{
         if(b==0){
            throw new DividebyZeroException();
         }
         return a/b;
    }

    public static void main(String[] args) {
          try{
        divide(10, 0);
        System.out.println("Within try");
          }catch(DividebyZeroException e){
                     System.out.println("Divide by Zero Exception");
          }
          
    }
}
