package org.test.transport.impl.aircraft;

import org.test.transport.interfaces.Aircraft;

public class TU134 implements Aircraft{
    @Override
    public void flight() {
        System.out.println("TU-134 flight");
    }
}
