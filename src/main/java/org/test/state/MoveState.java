package org.test.state;

public class MoveState implements TransformaterState{
    @Override
    public void action() {
        System.out.println("move");
    }
}
