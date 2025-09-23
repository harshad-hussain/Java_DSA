package LinkedList;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
 
    public static ArrayList<Integer> removeConsecutive(int Arr[]){
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(Arr[0]);

        for(int i=1;i<Arr.length;i++){
            if(Arr[i]!=Arr[i-1]){
                result.add(Arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int Arr[] = {10,20,20,30,30,40,50,20};

        ArrayList<Integer> result = removeConsecutive(Arr);
        for(int i=0;i<result.size();i++){
          System.out.print(result.get(i) + " ");
        }

    }
}
