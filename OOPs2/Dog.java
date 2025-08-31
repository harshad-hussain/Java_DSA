package OOPs2;

public class Dog extends Animal {
    
    public void Sound(){
        System.out.println("The Dog barks");
    }

    public Dog(){
        super(5);
        System.out.println("Constructor dog calls");
    }
}
