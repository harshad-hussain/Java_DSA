package Strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "cxxxxoxxxdxixnxg";

        char ch = 'x';

        String newstr = "";

        for(int i=0;i<str.length();i++){
               if(str.charAt(i) != ch){
                newstr = newstr+ str.charAt(i);
               }
        }
        System.out.println(newstr);
    }
}
