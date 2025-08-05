package SearchingndSorting;

import java.util.Scanner;

public class ClosestIndex {
    public static int main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();

        int Arr[] ={6,7,13,21,44,46};

        int left =0;
        int right=Arr.length-1;
        int ClosestIndex =-1;
        int MinDiff = Integer.MAX_VALUE;

        while(left<=right){
          int mid = (left+right)/2;
          int current_Diff = mid-target;
        
          if(current_Diff<MinDiff){
            MinDiff = current_Diff;
            ClosestIndex=mid;
          }

          if(Arr[mid]<target){
              left = mid+1;
          }
          else if(Arr[mid]>target){
            right= mid-1;
          }
          else{
            System.out.println(mid);
          }

        }
        return ClosestIndex;
    }
}
