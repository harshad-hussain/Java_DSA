package RecursionAdv;

import TEST.sort;

public class StringToInt {

    public static int StringHelper(String input){
        if(input.length() == 1){
            return input.charAt(0) -'0';
        }

        int smallAns = StringHelper(input.substring(0, input.length()-1 ));
        int lastDigit = input.charAt(input.length()-1) - '0';
        int result = smallAns *10 + lastDigit;

        return result;
    }
    public static void main(String[] args) {
          int result2=    StringHelper("00021030");
         System.out.println(result2);
         
    }
}
