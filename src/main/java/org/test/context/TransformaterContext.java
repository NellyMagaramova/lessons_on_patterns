package org.test.context;

import org.test.state.TransformaterState;

public class TransformaterContext implements TransformaterState
{
    private TransformaterState  state;

    public TransformaterState getState(){
        return state;
    }

    public void setState(TransformaterState state){
        this.state = state;
    }

    @Override
    public void action() {
        this.state.action();
    }
}
