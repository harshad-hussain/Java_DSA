package Generics;

public class Pairuse {
  public static void main(String[] args) {
    
     Pair <String,Integer> pinner = new Pair<>("ab",18); 
    Pair<Pair<String,Integer>,String> outer = new Pair<>(pinner , "Second");

    // p.setFirst(pinner);
    System.out.println(outer.getFirst().getFirst());
    System.out.println(outer.getFirst().getSecond());
    System.out.println(outer.getSecond());
     
    

    // Pair <String ,Integer> p = new Pair<>("ab",10);
    // System.out.println(p.getFirst()+ " " + " "+p.getSecond());

    // Pair <String>p = new Pair<>();
    //  System.out.println( p.getFirst());
    

    // Pair<String> ps = new Pair<String>("Hello", "World");
    //  System.out.println( ps.getFirst());
    // ps.setFirst("101 - Error");

    // Pair<Integer> pi = new Pair<Integer>(18, 27);
//    System.out.println( pi.getFirst());
//     pi.setFirst(60);
    
  }   
}
