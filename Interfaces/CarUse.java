package Interfaces;

public class CarUse extends Vehicle implements bus, Car  {
         
    @Override
    public boolean isMotorized(){
        return false;
    }

    @Override
    public String getCompany(){
        return "BMW";
    }
}
