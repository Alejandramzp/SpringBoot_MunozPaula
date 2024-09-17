
package com.example.DependenciasP1.EjMotor;

public class Vehiculo {
    private final Motor motor;

    public Vehiculo(Motor motor) {
        this.motor = motor;
    }
    
    public void iniciar(){
        System.out.println("Arrancó esta vaina");
        motor.arrancar();
    }
}
