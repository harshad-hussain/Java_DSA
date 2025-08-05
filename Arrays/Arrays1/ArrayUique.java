package Arrays.Arrays1;

public class ArrayUique {
     public static void main(String[] args) {
        
        int arr[] = {1,1,2,3,4,4,5,3,7,7,9};

        for(int i=0;i<arr.length;i++){
               int count =0;
        
             for(int j=0;j<arr.length;j++){

                if(arr[i] ==arr[j]){
                     count++;
                }

             }

               if(count==1){
                System.out.print(arr[i] + " ");
            }
            }

          
            
        }

     }

