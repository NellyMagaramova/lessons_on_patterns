package org.test.state;

public class FireState implements TransformaterState{

    @Override
    public void action() {
        System.out.println("fire");
    }
}
