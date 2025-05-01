package org.test;

import org.test.factory.impl.RussianFactory;
import org.test.factory.impl.USAFactory;
import org.test.factory.interfaces.TransportFactory;


public class Main {
    private static TransportFactory factory;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
          if(true){
              factory = new RussianFactory();
          }else{
              factory = new USAFactory();
          }
          factory.createAircraft();
          factory.createCar();
    }
}