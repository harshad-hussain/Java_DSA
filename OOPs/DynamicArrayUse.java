package OOPs;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        
        for(int i=1;i<25;i++){
            d.add(100+ i);
        }

        System.out.println(d.size());
        System.out.println(d.get(2));
        d.add(2, 55);
        d.printAll();
        
        
        // d.set(3,77);
        // d.get(3);

        // while(!d.isEmpty()){
        //     System.out.println(d.removeLast());
        //     System.out.println("size - " + d.size());
        // }

        
    }
}
