package org.akash;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop obj created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling on laptop...");
    }
}
