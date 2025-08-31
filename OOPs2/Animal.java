package OOPs2;

public class Animal {

    int teeth;
    
    public Animal(int teeth){
        this.teeth = teeth;
        System.out.println("Animal constructor calls");
    }

    public void Sound(){
        System.out.println("The animal  makes a sound");
    }
}
