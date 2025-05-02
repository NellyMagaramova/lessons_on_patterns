package org.test.facade;

import org.test.parts.Door;
import org.test.parts.Wheel;
import org.test.parts.Zazhiganie;

public class CarFacade {
    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
}
