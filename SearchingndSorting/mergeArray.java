package SearchingndSorting;

public class mergeArray {
    public static void main(String[] args) {
        int A[] = {0,1,2,4,6,5,7};
        int B[] = { 8, 11,14,16,18};

        int c[] = new int[A.length+B.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<A.length&& i<B.length){
            if(A[i]<B[j]){
                c[k]=A[i];
                i++;
                k++;
            }else {
                c[k] = B[j];
                j++;
                k++;
            }
        }

        while(i<A.length){
            c[k] =A[i];
            i++;
            k++;
        }
        while(j<B.length){
            c[k] = B[j];
            j++;
            k++;
        }

        for(int nums:c){
            System.out.print(nums+ " ");
        }



    }
}
