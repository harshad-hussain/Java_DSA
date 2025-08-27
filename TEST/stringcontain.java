package TEST;

public class stringcontain {
    public static void main(String[] args) {
        String str1 = "cfweoadrviefacnjiomlkiog";
        String str2= "coding";

        int i=0;
        int j=0;

        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                j++;
            }
            i++;
        }
        
        if(j==str2.length()){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
