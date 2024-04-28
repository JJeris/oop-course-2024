package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Amphibia extends Transport {
    Ship ship;
    Vehicle vehicle;

    Amphibia(String id, float consumption, int tankSize, byte sails, int wheels) {
        super(id, consumption, tankSize);
        ship = new Ship(id, sails);
        vehicle = new Vehicle(id, consumption, tankSize, wheels);
    }

    @Override 
    public String move(Road road) {
        if ((road.getClass() == WaterRoad.class)) {
            return ship.move(road);
        }
        return vehicle.move(road);
    }
}
