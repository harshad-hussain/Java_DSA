package Arrays.Arrays1;

public class Arrayintersect {

    public static void main(String[] args) {
        
    
    
    int arr1[] = {1,2,3,4,5,5,6,7,4};

    int arr2[]= {5,2,5,6,2,2,6,7};

    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            
            if(arr1[i] == arr2[j]){
                  System.out.print(arr1[i] +" ");
                  arr2[j] = Integer.MIN_VALUE;
                  break;
            }

        }
    }

}
 }
