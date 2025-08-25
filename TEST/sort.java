package TEST;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
                                          
        Scanner s = new Scanner(System.in);                                                    
        int n = s.nextInt();                                                               
                                                                                            
        int arr[]= new int[n];                                                                     
                                                                                              
        int zero = 0;                                                                         
        int i = 0;                                                                             
        int two =arr.length-1;                                                                              
                                                                                                  
        while(i<=two){                                                                      
              if(arr[i]==0){                                                                      
                  int temp =arr[i];                                                                   
                  arr[i]= arr[zero];                                                 
                  arr[zero]= temp;                                                    
                  zero++;                                                                   
                  i++;                                                                        
              }                                                                     
              else if(arr[i]==1){                                            
                  i++;                                                         
              }                                                                    
              else if(arr[i]==2){                                                                  
                  int temp = arr[i];                                                
                  arr[i]= arr[two];                                                 
                  arr[two] = temp;                                                 
                  two--;             
              }
        }
    }
}


