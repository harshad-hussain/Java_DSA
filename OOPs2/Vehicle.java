package OOPs2;

public class Vehicle {
    
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
}
