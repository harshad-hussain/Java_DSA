package RecursionAdv;

public class Stringreplace {

    public static String  replaceHelper(String str, char c1 , char c2){
        if(str.length() ==0 ){
            return str;
        }

        String smalloutput = replaceHelper(str.substring(1), c1, c2);

        if(str.charAt(0) == c1){   
            return  c2 + smalloutput;
        }  
        else{
            return  str.charAt(0) + smalloutput;
        }

    }
    public static void main(String[] args) {
        String output = replaceHelper("Harajaia", 'a', 'x');
        System.out.print( output);
    }
}
