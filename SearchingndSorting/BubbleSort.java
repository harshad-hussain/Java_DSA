package SearchingndSorting;

public class BubbleSort {
    public static void main(String[] args) {

        int Arr[]= {5,3,6,8,2,9} ;

        for(int i=0;i<Arr.length-1;i++){
            for(int j=0;j<Arr.length-1-i;j++){
                if(Arr[j]>Arr[j+1]){
                    int temp = Arr[j];
                    Arr[j]= Arr[j+1];
                    Arr[j+1] = Arr[j];
                }
            }
        }

        for(int num:Arr){
            System.out.print(num);
        }




    }
}
