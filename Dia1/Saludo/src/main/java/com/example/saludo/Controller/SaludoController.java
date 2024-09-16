
package com.example.saludo.Controller;

import com.example.saludo.Model.SaludoModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaludoController {
    
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("saludo", new SaludoModel());
        return "saludo";
    }
    
    @PostMapping("/saludo")
    public String saludo(@RequestParam(name = "nombre", required = false, defaultValue = "Guest")String nombre, Model model){
        SaludoModel saludo = new SaludoModel(nombre);
        model.addAttribute("saludo", saludo);
        return "saludo";
    }
    
}
