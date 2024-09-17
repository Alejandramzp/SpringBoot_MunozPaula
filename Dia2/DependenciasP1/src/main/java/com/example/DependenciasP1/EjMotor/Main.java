
package com.example.DependenciasP1.EjMotor;


public class Main {
    
    public static void main(String[] args) {
        Motor motorGasolina = new MotorGasolina();
        Vehiculo miCarro = new Vehiculo(motorGasolina);
    
        miCarro.iniciar();
    }       
}
