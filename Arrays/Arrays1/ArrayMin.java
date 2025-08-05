package Arrays.Arrays1;

public class ArrayMin {
    public static void main(String[] args) {
        int arr[] = {7,2,3,4,5,6,7,6,6,6,2};


        int min = arr[0];

        
        for(int i=1;i<=arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                System.out.println(min);
            }
        }


    }
}
