package RecursionAdv;

import java.util.Arrays;

import SearchingndSorting.mergeArray;

public class Mergesort {

    public static void mergeSorted(int Arr[],int arr1[],int arr2[]){
                   int i=0;
                   int j=0;
                   int k=0;

        while(i<arr1.length && j<arr2.length){                   
            if(arr1[i] <= arr2[j]){            
                  Arr[k++] = arr1[i++];             
            }             
            else{                    
                Arr[k++] = arr2[j++];               
            }
        }                 

        while(i<arr1.length){
            Arr[k++] = arr1[i++];
        }

        while(j<arr2.length){
            Arr[k++] = arr2[j++];
        }

    }

    public static int[] split(int[] arr){
        if(arr.length <=1){
            return arr;
        }
           
        int s1[] = new int[arr.length/2];
        int s2[] = new int[arr.length - s1.length];

        for(int i=0 ; i< arr.length/2;i++){
            s1[i] = arr[i];
        }

        for(int j = arr.length/2;j<arr.length;j++){
            s2[j - arr.length/2] = arr[j]; 
        }

        s1 = split(s1);
        s2 = split(s2);

        mergeSorted(arr, s1, s2);
        return arr;
    }


    public static void main(String[] args) {
        int arr[] = { 1,7,3,6,9,4,9,7,5,2,1,0};

         int[] result =  split(arr);
        System.out.println(Arrays.toString(result));
    }
}
