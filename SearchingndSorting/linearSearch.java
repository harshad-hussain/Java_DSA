package SearchingndSorting;

import java.util.Scanner;

public class linearSearch {
    public static int main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int A[] = {1,2,3,4,5,6,7,8,9,11,3,5,7,};

        int num= s.nextInt();

        for(int i=0;i<A.length;i++){
            if(num==A[i]){
                return i;
            }
        }
        return -1;
    }
}
