package com.example.Productos;


import com.example.Productos.View.ProductoView;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductosApplication implements CommandLineRunner {

    private final ProductoView view;

    public ProductosApplication(ProductoView view) {
        this.view = view;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductosApplication.class, args);
    }

    @Override
    public void run(String... args) {
        view.mostrarMenu();
    }

}
