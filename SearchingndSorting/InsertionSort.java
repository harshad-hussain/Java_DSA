package SearchingndSorting;

public class InsertionSort {
    public static void main(String[] args) {
        int Arr[] = {3,5,6,2,9,0,7,8};

        for(int i= 1 ;i<Arr.length-1;i++){
             int temp = Arr[i];
             int j= i-1;
             while(j>=0 && Arr[j] > temp){
                    Arr[j+1]= Arr[j];
                    j--;
             }
             Arr[j+1] = temp;
        }

        for(int nums:Arr){
            System.out.print(nums);
        }
    }
}
