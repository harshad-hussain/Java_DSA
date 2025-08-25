package SearchingndSorting;

public class QuickSort {

    public static int partition(int []Arr,int si,int ei){
        int pivotElement = Arr[si];
        int smallerCount =0;

        for(int i=si+1;i<=ei;i++){
            if(Arr[i] < pivotElement){
                smallerCount++;
            }
        }

        int temp = Arr[si+smallerCount];
        Arr[si+smallerCount] = pivotElement;
         Arr[si] = temp;

         int i=si;
         int j =ei;
         while(i < j){
            if(Arr[i] < pivotElement){
                   i++;
            }else if(Arr[j] > pivotElement){
                j--;
            }else{
                 temp = Arr[i];
                 Arr[i] = Arr[j];
                 Arr[j] = temp;
                 i++;
                 j--;
            }
         }

         return si+smallerCount;
    }

    public static void quicksort(int[] Arr,int si,int ei){
          if(si >= ei){
            return ;
          }
          int pivotIndex = partition(Arr,si,ei);
          quicksort(Arr, si, pivotIndex-1);
          quicksort(Arr, pivotIndex+1, ei);
    }
    public static void main(String[] args) {
        int Arr[] = {1,5,3,7,4,7,9,0,3,7,0,8,12};
           quicksort(Arr, 0, Arr.length-1);
        for(int i =0;i<Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }

    }
}
