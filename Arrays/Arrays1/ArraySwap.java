package Arrays.Arrays1;

public class ArraySwap {
    public static void main(String[] args) {
        

        int arr[] = {1,2,5,3,4,5,6,7};

        for(int i=0;i<arr.length-1;i+=2)    {

            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] =temp;

        }

         System.out.println("Array after swapping alternate elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
    }
}
