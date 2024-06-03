package jtm.activity05;

import jtm.activity04.Road;

public class Amphibia extends Vehicle {
    // Ship ship;
    // Vehicle vehicle;
    private byte sails;

    public Amphibia(String id, float consumption, int tankSize, byte sails, int wheels) {
        super(id, consumption, tankSize, wheels);
        this.sails = sails;
        // ship = new Ship(id, sails);
        // vehicle = new Vehicle(id, consumption, tankSize, wheels);
    }

    @Override 
    public String move(Road road) {
        if (road.getClass() == WaterRoad.class) {
            // return Ship.move(new Ship(this.getId(), this.sails), road);
            return getType() + " is sailing on " + road + " with " + sails + " sails";
        }
        // String status = vehicle.move(road).replace("Vehicle", "Amphibia");
        // this.setFuelInTank(vehicle.getFuelInTank());
        return super.move(road);//status;
    }
}
