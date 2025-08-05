package Arrays.Arrays1;

public class ArrayEvenOdd {
     public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,8,9};

        int oddCount =0;
        int evenCount =0;

        for(int i=0;i<arr.length;i++){
            
            if(i%2==0){
                evenCount++;
            }
            else if(i%2!=0){
                oddCount++;
            }
        }
        System.out.println("The odd count is " + oddCount);
        System.out.println("The even count is " + evenCount);


     }
}
