package org.test;
import org.test.context.TransformaterContext;
import org.test.state.FireState;
import org.test.state.MoveState;
import org.test.state.TransformaterState;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TransformaterContext context = new TransformaterContext();
        TransformaterState stateMove = new MoveState();
        TransformaterState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();

    }
}