package RecursionAdv;

public class StringRemoval {

    public static String removechar(String str , char c){
              if(str.length() ==0){
                return str;
              }
              String smallOutput = removechar(str.substring(1), c);
              if(str.charAt(0) == c){
                     return smallOutput;
              }
              else{   
                 return str.charAt(0) + smallOutput;
              }
    }


    public static void main(String[] args) {
          String result = removechar("Hxkxxixfxux", 'x');
          System.out.println(result);
    }
}
