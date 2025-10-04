package com.example.tuan06.Bai1.model.example;

public class main {
    public static void main(String[] args) {
        ICEngine engine = new ICEngine();

        //Inject engine in car
        Car car = new Car(engine);
        car.start();
    }
}
