package org.test.factory.impl;
import org.test.factory.interfaces.TransportFactory;
import org.test.transport.impl.aircraft.Boeing747;
import org.test.transport.impl.car.Porsche;
import org.test.transport.interfaces.Aircraft;
import org.test.transport.interfaces.Car;

public class USAFactory implements TransportFactory{
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
