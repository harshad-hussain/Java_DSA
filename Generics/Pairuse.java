package Generics;

public class Pairuse {
  public static void main(String[] args) {
    Pair<String> ps = new Pair<String>("Hello", "World");
    
     System.out.println( ps.getFirst());
    ps.setFirst("101 - Error");

    Pair<Integer> pi = new Pair<Integer>(18, 27);

   System.out.println( pi.getFirst());
    pi.setFirst(60);
    
  }   
}
