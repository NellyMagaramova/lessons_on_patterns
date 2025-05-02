package org.test;

import org.test.facade.CarFacade;


public class Main {
    public static void main(String[] args) {

          CarFacade  carFacade = new CarFacade();
          carFacade.go();
    }
}