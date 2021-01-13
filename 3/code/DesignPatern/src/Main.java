package com.company;

public class Main {
 

    
    public static void main(String[] args) {
    AbstractFactory vehicleFactory = FactoryProducer.getFactory("VEHICLE");

         Vehicle car = vehicleFactory.getVehicle("Car");
        car.showVehicleType();
         Vehicle motorCycle = vehicleFactory.getVehicle("MotorCycle");
         motorCycle.showVehicleType();

      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color redColor = colorFactory.getColor("RED");
        redColor.fill();
        Color blueColor = colorFactory.getColor("BLUE");
        blueColor.fill();

        
        
    }
}
