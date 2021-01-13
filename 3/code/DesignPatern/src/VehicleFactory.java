package com.company;

public class VehicleFactory    implements AbstractFactory {


    public Vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        } else if(vehicleType.equals("Car")){
            return new Car();
        } else if(vehicleType.equals("MotorCycle")){
            return new MotorCycle();
        }
        return null;
    }


}
