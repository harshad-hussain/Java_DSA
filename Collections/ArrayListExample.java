package Collections;
import java.util.*;

public class ArrayListExample{
      public static void main(String[] args) {
        
        ArrayList<Integer> List1 = new ArrayList<>();

        List1.add(100);
        List1.add(200);
        List1.add(300);
        System.out.println(List1);

        int val = List1.get(0);
        System.out.println(val);

        List1.add(1,0);
        System.out.println(List1);

         List1.set(0,999);
         System.out.println(List1);

         List1.remove(0);
         System.out.println(List1); 


         System.out.println(List1.contains(200));

         Collections.sort(List1);   
         System.out.println(List1);

         List1.clear();
         System.out.println(List1);
        

        
      }
}