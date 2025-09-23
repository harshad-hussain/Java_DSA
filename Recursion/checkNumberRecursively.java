package Recursion;

public class checkNumberRecursively {
    public static boolean checkNumber(int input[],int x){
           return isHelper(input, x, 0);
    }
    
    public static boolean isHelper(int input[],int x,int startIndex){
        if(startIndex == input.length){
            return  false;
        }
        if(input[startIndex]==x){
            return true;
        }
        else{
           return isHelper(input,x, startIndex+1);
        }

    }
    public static void main(String[] args) {
        int input[]= {1,2,5,3,7};
        int x = 4;

          boolean result = checkNumber(input, x);  
    System.out.println(result);

    }
}
