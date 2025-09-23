package Arrays.Arrays2;

import java.util.Scanner;

public class ArrayInsert2 {
     
    public static int takeInput(String str){
        Scanner s = new Scanner(System.in);
        System.out.print(str);

        int num = s.nextInt();
        return num; 
    }

    public static void insert(int Arr[],int pos, int ele,int size){

        for(int i = size ; i>pos ;i--){
            Arr[i] = Arr[i-1];
            Arr[pos] = ele;
            size++;
        } 
    }

    
    public static void main(String[] args) {

        int capacity = takeInput("Enter the capacity of the array : ");
           
        int size = takeInput("Enter the size of the array : ");

        int Arr[] = new int[capacity];

        for(int i=0;i<size;i++){
             Arr[i] = takeInput("Enter the element at " + i + "index" );
        }

        int ele = takeInput("Enter the element need to insert :");

        int pos = takeInput("Enter the position where element need to insert : ");

         insert(Arr, pos, ele, size);

         for(int i:Arr){
            System.out.print(i + " ");
         }

     }
}
