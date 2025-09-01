package OOPs2;

public  class Car extends Vehicle {
      int nodoors;
      int speed;
      
        public void print(){
        System.out.println( "The car Speed is" + speed + " " + super.speed + " color is " + getColor() + " the doors is" + nodoors );
    }

    public void printMaxSpeed(){
        System.out.println( speed + " " + super.speed);
    }

    @Override
    public boolean isMotorized(){
      return true;
    }
}
