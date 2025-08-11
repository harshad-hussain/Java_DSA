package SearchingndSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int Arr[]={8,4,3,9,2,4,0,1};

        for(int i =0;i<Arr.length-1;i++){
            int min = i;
            for( int j=i+1;j<Arr.length;j++){
                if(Arr[j]<Arr[min]){
                    min = j;
                  }
            }
            int temp = Arr[i];
            Arr[i]= Arr[min];
            Arr[min]=temp;
        }

        for(int nums:Arr){
            System.out.print(nums +" ");
        }
    }
}
