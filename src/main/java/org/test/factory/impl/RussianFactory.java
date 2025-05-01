package org.test.factory.impl;
import org.test.factory.interfaces.TransportFactory;
import org.test.transport.impl.aircraft.TU134;
import org.test.transport.interfaces.Aircraft;
import org.test.transport.interfaces.Car;
import org.test.transport.impl.car.Niva

public class RussianFactory implements TransportFactory{
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
