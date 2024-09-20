package com.example.RestaurantesJPA.controller;

import com.example.RestaurantesJPA.model.Mesa;
import com.example.RestaurantesJPA.model.Plato;
import com.example.RestaurantesJPA.service.RestaurantManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EntityManager {

    @Autowired
    private RestaurantManager restaurantManager;

    //Plato
    //Guardar un Plato
    //localhost:8080/api/plato con verbo POST
    @PostMapping("/plato")
    public Plato guardarPlato(@RequestBody Plato plato){
        return restaurantManager.guardarPlato(plato);
    }

    //Obtener todos los platos
    //localhost:8080/api/plato con verbo GET
    @GetMapping("/plato")
    public List<Plato> mostarTodosLosPlatos(){
        return restaurantManager.mostarTodosLosPlatos();
    }

    //Obtener un plato por ID
    //localhost:8080/api/plato/id con verbo GET
    @GetMapping("/plato/{id}")
    public Plato mostarPlatoPorId(@PathVariable Integer id){
        return restaurantManager.mostarPlatoPorId(id).orElseThrow();
    }

    //Actualizar un plato por ID
    //localhost:8080/api/plato/id con verbo PUT
    @PutMapping("/plato/{id}")
    public Plato actualizarPlato(@PathVariable Integer id, @RequestBody Plato plato){
        return restaurantManager.actualizarPlato(id, plato);
    }

    //Eliminar un plato por ID
    //localhost:8080/api/plato/id con verbo DELETE
    @DeleteMapping("/plato/{id}")
    public void eliminarPlato(@PathVariable Integer id){
        restaurantManager.eliminarPlato(id);
    }

    //Mesa
    //Guardar una Mesa
    //localhost:8080/api/mesa con verbo POST
    @PostMapping("/mesa")
    public Mesa guardarMesa(@RequestBody Mesa mesa){
        return restaurantManager.guardarMesa(mesa);
    }

    //Obtener todas las mesas
    //localhost:8080/api/mesa con verbo GET
    @GetMapping("/mesa")
    public List<Mesa> mostarTodasLasMesas(){
        return restaurantManager.mostarTodasLasMesas();
    }

    //Obtener un plato por ID
    //localhost:8080/api/mesa/id con verbo GET
    @GetMapping("/mesa/{id}")
    public Mesa mostarMesaPorId(@PathVariable Integer id){
        return restaurantManager.mostarMesaPorId(id).orElseThrow();
    }

    //Actualizar un plato por ID
    //localhost:8080/api/mesa/id con verbo PUT
    @PutMapping("/mesa/{id}")
    public Mesa actualizarMesa(@PathVariable Integer id, @RequestBody Mesa mesa){
        return restaurantManager.actualizarMesa(id, mesa);
    }

    //Eliminar un plato por ID
    //localhost:8080/api/mesa/id con verbo DELETE
    @DeleteMapping("/mesa/{id}")
    public void eliminarMesa(@PathVariable Integer id){
        restaurantManager.eliminarMesa(id);
    }

}
