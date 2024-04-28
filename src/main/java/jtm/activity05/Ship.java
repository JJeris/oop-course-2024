package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {
    protected byte sails;
    
    public Ship(String id, float consumption, int tankSize) {
        super(id, consumption, tankSize);
    }
    public Ship(String id, byte sails) {
        super(id, 0, 0);
        this.sails = sails;
    }
    @Override
    public String move(Road road) {
        if (!(road.getClass() == WaterRoad.class)) {
            return "Cannot sail on " + road;
        }
        return getType() + super.move(road).replace("moving", "sailing") + "with " + sails + " sails";
    }
}
