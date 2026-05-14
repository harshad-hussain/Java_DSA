public class Car extends Vehicle {
    
    String name;

    public Car(String name){
        super(name);
        this.name = name;
    }

    public void start(){
        System.out.println( name + " is starting and max speed is 200");

    }

    public static void main(String[] args) {
        Car c1 = new Car("Busvolvo");
        c1.start();

        Vehicle v2 = new Vehicle("Lambo");
        v2.start();
    }
}
