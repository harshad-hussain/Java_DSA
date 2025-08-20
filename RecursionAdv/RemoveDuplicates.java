package RecursionAdv;

import Recursion.returnIndex;

public class RemoveDuplicates {
    public static String helper(String str, int startIndex){
        if(startIndex == str.length()){
            return "";
        }
        String smallOutput = helper(str, startIndex+1);

        if(startIndex > 0 && str.charAt(startIndex) ==str.charAt(startIndex-1)){
            return smallOutput;
        }
        else{
            return str.charAt(startIndex ) + smallOutput;
        }

    }
    public static void main(String[] args) {
         String result = helper("HHaarssshaadh", 0);
         System.out.println(result);
    }
}
