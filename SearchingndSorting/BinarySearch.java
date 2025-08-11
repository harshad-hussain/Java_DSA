package SearchingndSorting;

import java.util.Scanner;

public class BinarySearch {
    public static int main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int Arr[] = {1,2,3,4,5,6,7,8,9,10};

        int num = s.nextInt();

        int l=0;   
        
        int r= Arr.length-1;       

        while(l<=r){
            int mid =(l+r)/2;

            if(mid==num){
                return mid;
            }
            else if(mid>num){
               r= mid-1;
            }
            else{
                r=mid+1;
            }
        }
        return -1;
        


    }
}
