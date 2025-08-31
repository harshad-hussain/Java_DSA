package OOPs2;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v= new Vehicle();

        v.color = "Red";
        v.speed = 100;
        v.print();

        Car c1= new Car();

        c1.color ="black";
        c1.speed =130;
        c1.nodoors=4;
        c1.print();

        bicycle b1 = new bicycle();
        b1.color = "orange";
        b1.speed =40;
        b1.brand = " Hercules";
        b1.print();
    }
}
