package Arrays.Arrays1;

public class ArrayTraverse {
    
    public static void main(String[] args) {
        
        int arr[] ={1,2,3,4,5,5,9,15,19,30};

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }

        //forEach loop - iterate over directly the value in the array
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
