package RecursionAdv;

public class stringStart {

    public static boolean helper(String str,int startIndex){
        if(startIndex == str.length()){
            return true;
        }
        if(str.charAt(0) == 'a'){
            if(startIndex < str.length() && str.startsWith("bb",startIndex+1)){
                return helper(str, startIndex+3);
            }
        }else{
            return helper(str, startIndex+1);
        }

        if(str.startsWith("bb",startIndex)){
             return helper(str, startIndex+2);
        }
           
        return false;
    }


    public static void main(String[] args) {
         String s = "abb";
         boolean result = helper(s, 0);
         System.out.println(result);
    }
}
