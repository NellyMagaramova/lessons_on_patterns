package org.test.factory.interfaces;
import org.test.transport.interfaces.Aircraft;
import org.test.transport.interfaces.Car;

public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
