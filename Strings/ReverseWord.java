package Strings;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String finalString = "";
        String arr[] = str.split(" ");

        for(int i=0;i<arr.length;i++){
             String currentWord = arr[i];
             String reversedWord = reverse(currentWord );
             finalString += reversedWord + " ";
        }
        System.out.println(finalString);
    }

    public static String reverse(String str){
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }
        return reverse;
           
    }
}
