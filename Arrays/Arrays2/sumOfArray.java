package Arrays.Arrays2;

import java.util.Scanner;

public class sumOfArray {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = s.nextInt(); 
        int output[] = new int[size];

        int arr1[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements in the " + i + "th index");
            arr1[i] = s.nextInt();
        }
        int arr2[] = new int[size];
        for(int j=0;j<size;j++){
            System.out.print("Enter the elements in the " + j + "th index");
            arr2[j] = s.nextInt();
        }

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = output.length-1;

        int carry =0;

        while(i>=0||j>=0|| carry!=0){
            int sum = carry;
            if(i>=0){
                sum = sum +arr1[i];
                i--;
            }
            if(j>=0){
                sum = sum + arr2[j];
                j--;
            }
              
           
             output[k] = sum % 10;
        carry = sum/10;
         k--;
        }
        for(int l:output){
            System.out.print(l+" ");
        }
     }   
}
