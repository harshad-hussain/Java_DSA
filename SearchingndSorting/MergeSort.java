package SearchingndSorting;

import java.util.Arrays;

public class MergeSort {


    public static void mergeSort(int[] Arr , int[] Arr1, int[] Arr2){
            int i = 0;
            int j = 0;
            int k=0;

            while(i < Arr1.length && j < Arr2.length){
               if(Arr1[i] < Arr2[j]){
                   Arr[k++] = Arr1[i++];
               }else{
                    Arr[k++] = Arr2[j++];
               }
            }

            while(i < Arr1.length){
                 Arr[k++] = Arr1[i++];
            }
            while(j<Arr2.length){
                Arr[k++] =Arr2[j++];
            }
    }

    public static int[] split(int Arr[]){

        if(Arr.length<=1){
            return Arr;
        }
        
        int s1[] = new int[Arr.length/2];
        int s2[] = new int[Arr.length - s1.length];
         
        for(int i=0;i<Arr.length/2;i++){
            s1[i] = Arr[i];
        }

        for(int j = Arr.length/2;j<Arr.length;j++){
            s2[j-Arr.length/2] = Arr[j];
        }

        s1= split(s1);
        s2= split(s2);

        mergeSort(Arr,s1,s2);
        return Arr;

    }
    public static void main(String[] args) {
        int Arr[] ={1,5,7,3,7,9,3,9,3,0,2};

          int[] result = split(Arr);
          System.out.println(Arrays.toString(result));
    }
}
