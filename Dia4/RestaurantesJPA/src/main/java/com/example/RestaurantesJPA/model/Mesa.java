package com.example.RestaurantesJPA.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mesa")
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int numero_mesa;
    private boolean ocupada;

    public Mesa() {
    }

    public Mesa(int numero_mesa, boolean ocupada) {
        this.numero_mesa = numero_mesa;
        this.ocupada = ocupada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_mesa() {
        return numero_mesa;
    }

    public void setNumero_mesa(int numero_mesa) {
        this.numero_mesa = numero_mesa;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
