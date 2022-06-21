package com.aplicacion_clase_repaso.clase_repaso.controlers;

import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceCalcuBasica;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceSaludo;
import com.aplicacion_clase_repaso.clase_repaso.services.implementacion.ImplementSaludo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping

public class CalculadoraBasica {
   private final InterfaceCalcuBasica calcularBasica;
   private final CalculadoraConfig config;
   private final ImplementSaludo implementSaludo;

   public CalculadoraBasica(CalculadoraConfig config, InterfaceCalcuBasica calcularBasic, ImplementSaludo implementSaludo){
    this.config = config;
    this.calcularBasica = calcularBasic;
    this.implementSaludo = implementSaludo;

   }

    @Value("${cuenta}")
    String mensaje;

    @GetMapping("/suma")
    public ResponseEntity getSuma (@PathParam(" ") String numero1, @PathParam(" ") String numero2){

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int resultado = num1 + num2;
        return ResponseEntity.ok( implementSaludo.getSaludo() +"\n" +mensaje + " " + resultado);

    }

    @GetMapping("/resta/{numero1}/{numero2}")
    public ResponseEntity  getResta(@PathVariable String numero1, @PathVariable String numero2){

       int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int resultado = num1 - num2;

        return ResponseEntity.ok(implementSaludo.getSaludo() +"\n" +config.getReste() + " " + resultado);
    }

    @GetMapping("/multiplicacion/{numero1}/{numero2}")
    public ResponseEntity  getmultiplicacion(@PathVariable String numero1, @PathVariable String numero2){
     return calcularBasica.Multiplicando(numero1,numero2);
    }

   @GetMapping("/division/{numero1}/{numero2}")
   public ResponseEntity  getDivision(@PathVariable String numero1, @PathVariable String numero2){
       return calcularBasica.Dividiendo(numero1,numero2);
    }

}
