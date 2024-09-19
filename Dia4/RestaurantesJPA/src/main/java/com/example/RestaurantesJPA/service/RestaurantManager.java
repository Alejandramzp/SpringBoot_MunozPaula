package com.example.RestaurantesJPA.service;

import com.example.RestaurantesJPA.model.Mesa;
import com.example.RestaurantesJPA.model.Plato;
import com.example.RestaurantesJPA.repository.MesaRepository;
import com.example.RestaurantesJPA.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantManager {

    // Plato
    @Autowired
    private PlatoRepository platoRepository;

    //Guardar un plato
    public Plato guardarPlato(Plato plato){
        return platoRepository.save(plato);
    }

    //Obtener todos los platos
    public List<Plato> mostarTodosLosPlatos(){
        return platoRepository.findAll();
    }

    //Obtener un plato por ID
    public Optional<Plato> mostarPlatoPorId(Integer id){
        return platoRepository.findById(id);
    }

    //Actualizar un plato por ID
    public Plato actualizarPlato(Integer id, Plato platoDetalles){
        Plato plato = platoRepository.findById(id).orElseThrow();
        plato.setNombre(platoDetalles.getNombre());
        plato.setPrecio(platoDetalles.getPrecio());
        plato.setDisponibilidad(platoDetalles.isDisponibilidad());
        return platoRepository.save(plato);
    }

    //Eliminar un plato por ID
    public void eliminarPlato(Integer id){
        platoRepository.deleteById(id);
    }

    // Mesa
    @Autowired
    private MesaRepository mesaRepository;

    //Guardar una mesa
    public Mesa guardarMesa(Mesa mesa){
        return mesaRepository.save(mesa);
    }

    //Obtener todas las mesas
    public List<Mesa> mostarTodasLasMesas(){
        return mesaRepository.findAll();
    }

    //Obtener una mesa por ID
    public Optional<Mesa> mostarMesaPorId(Integer id){
        return mesaRepository.findById(id);
    }

    //Actualizar una mesa por ID
    public Mesa actualizarMesa(Integer id, Mesa mesaDetalles){
        Mesa mesa = mesaRepository.findById(id).orElseThrow();
        mesa.setNumero_mesa(mesaDetalles.getNumero_mesa());
        mesa.setOcupada(mesaDetalles.isOcupada());
        return mesaRepository.save(mesa);
    }

    //Eliminar una mesa por ID
    public void eliminarMesa(Integer id){
        mesaRepository.deleteById(id);
    }
}
