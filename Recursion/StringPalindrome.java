package Recursion;

public class StringPalindrome {

    public static boolean helper(String str,int startIndex , int lastIndex){
                         
        if(startIndex>=lastIndex){
            return true;
        }

        if(str.charAt(startIndex)!= str.charAt(lastIndex)){
            return false;
        }

        return helper(str, startIndex+1, lastIndex-1);

    }
    public static void main(String[] args) {
            String str = "abab";

        //    if(str.length() ==0 || str.length()==1){
        //     return true;
        // } 

        boolean result = helper(str, 0, str.length()-1);
        System.out.print(result);
    }
}
