
package com.example.Productos;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class Repositorio {
    private List<Producto> productos = new ArrayList<>();
    
    public List<Producto> mostrarTodo(){
        return productos;
    }
    
    public void guardar(Producto producto){
        productos.add(producto);
    }
    
    public Producto mostrarPorId(Long id){
        return productos.stream()
               .filter(producto -> producto.getId().equals(id))
               .findFirst()
               .orElse(null);
    }
}
