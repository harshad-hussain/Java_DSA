package OOPs2;

public abstract  class Vehicle {
    
    int speed ;
    private String color ;

    public void print(){
        System.out.println(" Base class Speed is" + speed + " color is " + color );
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public abstract boolean isMotorized();

    // public abstract String getCompanyName();
}
