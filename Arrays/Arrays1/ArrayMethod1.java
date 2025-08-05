package Arrays.Arrays1;

public class ArrayMethod1 {

    public static int[] increment(int arr[]){
            for(int i=0;i<arr.length;i++){
                arr[i] = arr[i]+2;
            }   
             return arr;
    }


    public static void main(String[] args) {
        int arr[] ={1,2,4,5,7,9};
         arr = increment(arr);
        System.out.println();

        
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
}
