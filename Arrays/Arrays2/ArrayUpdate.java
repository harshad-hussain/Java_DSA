package Arrays.Arrays2;

import java.util.Scanner;

public class ArrayUpdate {
     
      public static int takeInput(String str){

        Scanner s = new Scanner(System.in);
        
        System.out.print(str);

        int num = s.nextInt();
        return num;
      }

      public static void Update(int Arr[] , int key,int UpdatedKey){
               for(int i=0;i<Arr.length;i++){

                if(Arr[i] == key){
                    Arr[i] = UpdatedKey;
                    return;
                }
               }
               System.out.println("The key was not found check the code properly ");
      }
    
    
    public static void main(String[] args) {
    
        int cap =  takeInput("Enter the capacity of the array : ");

        int Arr[]=  new int[cap];

        for(int i=0;i<cap;i++){
            Arr[i] = takeInput("Enter the element at " + i + " index : ");
        }

        int key = takeInput("Enter the key : ");

        int UpdatedKey = takeInput("Enter the key need to update : ");
       
        Update(Arr,key,UpdatedKey);

        for(int i:Arr){
            System.out.print( i + " ");
        }
     }

    }
