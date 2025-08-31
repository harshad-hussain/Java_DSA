package Exceptions;

public class ExceptionDemo {

    public static int Factorial(int n) throws NegativeNumberException{
           if(n<0){
            throw new NegativeNumberException();
           }
           int ans =1;
           for(int i =2;i<=n;i++){
            ans = ans*i;
           }
           return ans;
    }

    public static int divide(int a ,int b) throws DividebyZeroException{
         if(b==0){
            throw new DividebyZeroException();
         }
         return a/b;
    }

    public static void main(String[] args) {
          try{
        divide(10, 10);
        Factorial(-4);
        System.out.println("Within try");
          }catch(DividebyZeroException e){
                     System.out.println("Divide by Zero Exception");
          }catch(NegativeNumberException e){
                     System.out.println("Negative number Exception");
          }finally{
            System.out.println("Finally");
          }
          
    }
}
