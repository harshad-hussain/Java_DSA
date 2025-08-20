package RecursionAdv;

public class replacePi {
    public static String replacehelper(String s){
        if(s.length() == 0){
            return s;
        }

        if(s.charAt(0) == 'p' && s.charAt(1) =='i'){
            String smallOutput = replacehelper(s.substring(2));
            return "3.14" + smallOutput;
        } else {
            String smallOutput = replacehelper(s.substring(1));
            return s.charAt(0)+ smallOutput;
        }

    }
    public static void main(String[] args) {
        String s ="Apipiapipiepfpi";
        String result = replacehelper(s);
        System.out.println(result);   
    }
}
