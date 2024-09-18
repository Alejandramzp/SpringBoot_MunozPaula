
package com.example.Productos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    private final Repositorio repositorio;
 
    @Autowired
    public Servicio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }
    
    public List<Producto> mostrarTodo(){
        return repositorio.mostrarTodo();
    }
    
    public void guardar(Producto producto){
        repositorio.guardar(producto);
    }
    
    public Producto mostrarPorId(Long id){
        return repositorio.mostrarPorId(id);
    }
}
