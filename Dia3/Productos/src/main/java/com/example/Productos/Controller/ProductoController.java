
package com.example.Productos.Controller;

import com.example.Productos.Model.Producto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;


@Controller
public class ProductoController {
    private final List<Producto> productos;

    public ProductoController() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Long id, String nombre, double precio) {
        Producto nuevoProducto = new Producto(id, nombre, precio);
        productos.add(nuevoProducto);
        System.out.println("Producto añadido: " + nuevoProducto);
    }

    public List<Producto> mostrarProductos() {
        return productos;
    }

    public Producto mostrarProductoPorId(Long id) {
        return productos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

