package com.example.tuan06.Bai1.model.example;

public class Car {
    private ICEngine engine;

    //Inject Engine object to Car class
    public Car(ICEngine engine) {
        this.engine = engine;
    }

    public void start () {
        engine.start();
    }
}
