package org.akash;

public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop obj created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling on desktop...");
    }
}
