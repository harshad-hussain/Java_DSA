package LinkedList;
import java.util.ArrayList; 

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);

        arr.add(2,50);
      //  arr.set(2, 60);
     //   arr.remove(2);
        System.out.println(arr.size());
        System.out.println(arr.get(1));
        
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) +" ");
        }


    }
}
