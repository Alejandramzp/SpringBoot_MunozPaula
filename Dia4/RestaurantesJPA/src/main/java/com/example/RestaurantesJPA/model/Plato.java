package com.example.RestaurantesJPA.model;

import jakarta.persistence.*;

@Entity
@Table(name = "plato")
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private double precio;
    private boolean disponibilidad;

    public Plato() {
    }

    public Plato(String nombre, double precio, boolean disponibilidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
