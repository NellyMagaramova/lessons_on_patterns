package org.test;

public class TestSingleton {
    private static final  TestSingleton instance = new TestSingleton();

    public static  TestSingleton getInstance(){
        return instance;
    }

    private TestSingleton(){}

    public void print(){
        System.out.println(this);
    }
}
