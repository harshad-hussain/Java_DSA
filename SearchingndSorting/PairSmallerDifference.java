package SearchingndSorting;

public class PairSmallerDifference {
    public static int main(String[] args) {
        int A[] = {5,6,7,3,8,2};
        int B[] = {1,2,6,8,3,0};

        for(int i=1;i<A.length;i++){
           int temp=A[i];
           int j = i-1;

           while(j>=0 && j>temp){
             A[j+1] = A[j];
             j--;
           }
           A[j+1] = temp;
        }

        
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                if(B[j]>B[j+1]){
                    int temp = B[j];
                    B[j] = B[j+1];
                    B[j+1] = temp;
                }
            }
        }

        int k=0;
        int l=0;
        int minDiff = Integer.MAX_VALUE;
        int currentDiff =0;

        while(k<A.length&&l<B.length){
            currentDiff = Math.abs(A[k]-B[l]) ;
                if(currentDiff<minDiff){
                    minDiff =currentDiff;
                }

                if(A[k]<B[l]){
                    k++;
                }
                else{
                    l++;
                }
            }
  
            return minDiff;
        }
    }

