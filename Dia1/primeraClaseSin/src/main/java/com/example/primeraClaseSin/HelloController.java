
package com.example.primeraClaseSin;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(path="/json",produces = "application/json")
public class HelloController {
    
    ArrayList<Campers> campers = new ArrayList<>();
    
    @GetMapping("/facil")
    public String facil(){
        return "Soy JSON";
    }  
    
    @GetMapping("/arreglo")
    public ArrayList<Campers> arreglo(){
        
        
        Campers c1 = new Campers();
        c1.setId("1");
        c1.setNombre("Paula");
        c1.setApellido("Muñoz");
        
        campers.add(c1);
        return campers;
    }
    
    @GetMapping("/{id}/{name}/{last}")
    public ResponseEntity<Campers> obtenerData(@PathVariable String id, @PathVariable String name, @PathVariable String last){
        
        Campers c1 = new Campers();
        c1.setId(id);
        c1.setNombre(name);
        c1.setApellido(last);
        
        campers.add(c1);
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Campers> entity = new ResponseEntity<>(c1,headers, HttpStatus.CREATED);
        return entity;
    }
}

/*@RequestMapping("/")
    public String holiii(){
        return "Hola P1!!!!";
    }
    
    @RequestMapping("/json")
    public Map<String,String> prueba(){
        Map<String,String> map = new HashMap<>();
        map.put("name","Hola P1!!!");
        return map;
    }
*/