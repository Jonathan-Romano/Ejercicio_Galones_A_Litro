
package com.TodoCode.EjercicioIntegradorOne.ConvertidorGalonesLitro.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GalonToLitroController {
    
    @GetMapping ("/convertidor")
    public String cuantosLitros(@RequestParam double galones){
        
        return ("la cantidad equivalente en litros de: "+ galones+ " galones es: "+ (galones * 3.78541)+" litros"  );
    }
    
    
    
}
