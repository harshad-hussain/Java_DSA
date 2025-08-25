package TimeandSpace;

public class ArrayIntersect {
    public static void main(String[] args) {
        
    
       int Arr1[] = {3,5,8,0,2,4,8,3};
       int Arr2[] = {6,3,2,6,2,21,7,8};

      for(int i=1;i<Arr1.length;i++){
             int temp = Arr1[i];
             int j = i-1;
             while( j >= 0 && Arr1[j] > temp){
                
                Arr1[j+1] = Arr1[j];
                j--;
             }
             Arr1[j+1] = temp;
      }

       for(int k=1;k<Arr2.length;k++){
             int temp =Arr2[k];
             int l = k-1;
             while( l >= 0 && Arr2[l] > temp){
              
                Arr2[l+1] = Arr2[l];
                l--;
             }
             Arr2[l+1] = temp;
      }

      for(int m = 0 ;m<Arr1.length;m++){
              for(int n =0;n<Arr2.length;n++){
                if(Arr1[m]== Arr2[n]){
                    System.out.print(Arr1[m] +" ");
                    Arr2[n] = Integer.MIN_VALUE;
                    break;
                }
              }
      }

    }
}
