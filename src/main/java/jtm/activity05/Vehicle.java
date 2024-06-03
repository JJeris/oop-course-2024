package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

// import jtm.activity05.WaterRoad;

public class Vehicle extends Transport {
    protected int wheels;

    public Vehicle(String id, float consumption, int tankSize, int wheels) {
        super(id, consumption, tankSize);
        this.wheels = wheels;
    }
    @Override
    public String move(Road road) {
        if (road.getClass() != Road.class) {
            return "Cannot drive on " + road;
        }
        // return super.move(road).replace("moving", "driving") + " with " + wheels + " wheels";
        return super.move(road).replace("moving", "driving") + " with " + wheels + " wheels";
    }
    // static String move(Transport transport, Road road) {
    //     if (transport instanceof Vehicle) {
    //         Vehicle vehicle = (Vehicle) transport;
    //         return vehicle.
    //     }
    // }
}
