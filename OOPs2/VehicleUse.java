package OOPs2;

public class VehicleUse {
    public static void main(String[] args) {
        // Vehicle v= new Vehicle();

        // v.setColor("red");
        // v.speed = 100;
        // v.print();

        Vehicle v;

        v = new Car();
        v.print();
        v.isMotorized();

        v= new bicycle();
        System.out.println(v.isMotorized());
        
        Car c1= new Car();
       

        // c1.setColor("Blue");
        // c1.speed =130;
        // c1.nodoors=4;
        // c1.print(); 
        // c1.printMaxSpeed();
        

        

        bicycle b1 = new bicycle();
        b1.setColor("White");
        b1.speed =40;
        b1.brand = " Hercules";
        b1.print();
    }
}
