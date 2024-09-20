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

    //--------------------- Platos -----------------------------
    //Guardar un Plato
    //localhost:8080/api/platos con verbo POST
    @PostMapping("/platos")
    public Plato guardarPlato(@RequestBody Plato plato){
        return restaurantManager.guardarPlato(plato);
    }

    //Obtener todos los platos
    //localhost:8080/api/plato con verbo GET
    @GetMapping("/platos")
    public List<Plato> mostarTodosLosPlatos(){
        return restaurantManager.mostarTodosLosPlatos();
    }

    //Obtener un plato por ID
    //localhost:8080/api/platos/id con verbo GET
    @GetMapping("/platos/{id}")
    public Plato mostarPlatoPorId(@PathVariable Integer id){
        return restaurantManager.mostarPlatoPorId(id).orElseThrow();
    }

    //Actualizar un plato por ID
    //localhost:8080/api/platos/id con verbo PUT
    @PutMapping("/platos/{id}")
    public Plato actualizarPlato(@PathVariable Integer id, @RequestBody Plato plato){
        return restaurantManager.actualizarPlato(id, plato);
    }

    //Eliminar un plato por ID
    //localhost:8080/api/platos/id con verbo DELETE
    @DeleteMapping("/platos/{id}")
    public void eliminarPlato(@PathVariable Integer id){
        restaurantManager.eliminarPlato(id);
    }

    //---------------------- Mesas -------------------------------
    //Guardar una Mesa
    //localhost:8080/api/mesas con verbo POST
    @PostMapping("/mesas")
    public Mesa guardarMesa(@RequestBody Mesa mesa){
        return restaurantManager.guardarMesa(mesa);
    }

    //Obtener todas las mesas
    //localhost:8080/api/mesas con verbo GET
    @GetMapping("/mesas")
    public List<Mesa> mostarTodasLasMesas(){
        return restaurantManager.mostarTodasLasMesas();
    }

    //Obtener una mesa por ID
    //localhost:8080/api/mesas/id con verbo GET
    @GetMapping("/mesas/{id}")
    public Mesa mostarMesaPorId(@PathVariable Integer id){
        return restaurantManager.mostarMesaPorId(id).orElseThrow();
    }

    //Actualizar una mesa por ID
    //localhost:8080/api/mesas/id con verbo PUT
    @PutMapping("/mesas/{id}")
    public Mesa actualizarMesa(@PathVariable Integer id, @RequestBody Mesa mesa){
        return restaurantManager.actualizarMesa(id, mesa);
    }

    //Eliminar una mesa por ID
    //localhost:8080/api/mesas/id con verbo DELETE
    @DeleteMapping("/mesas/{id}")
    public void eliminarMesa(@PathVariable Integer id){
        restaurantManager.eliminarMesa(id);
    }

}
