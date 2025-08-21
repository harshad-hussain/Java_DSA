package RecursionAdv;

public class pairStar {
    public static String helper(String str){
        if(str.length() == 1){
            return str;
        }

        String rest = helper(str.substring(1 ) );
            if(str.charAt(0) == rest.charAt(0) ){
            return str.charAt(0) +"*"+ rest;
        }else{
            return str.charAt(0)+ rest;
        }

    }
    public static void main(String[] args) {
        String str = "hellollw";
        System.out.println(helper(str));
    }
}
