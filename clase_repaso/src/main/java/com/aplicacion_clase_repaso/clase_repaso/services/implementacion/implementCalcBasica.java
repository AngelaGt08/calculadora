package com.aplicacion_clase_repaso.clase_repaso.services.implementacion;

import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceCalcuBasica;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service


public class ImplementCalcBasica implements InterfaceCalcuBasica {

   CalculadoraConfig calculadoraConfig;
    ImplementSaludo implementSaludo;

   public ImplementCalcBasica(CalculadoraConfig calculadoraConfig, ImplementSaludo implementSaludo){
       this.calculadoraConfig = calculadoraConfig;
       this.implementSaludo = implementSaludo;
   }
    public ResponseEntity Multiplicando(String num1, String num2){
        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);
        double resultado = numero1 * numero2;
        return ResponseEntity.ok(implementSaludo.getSaludo() +"\n" +calculadoraConfig.getMultiplique() + " " + resultado);
    }

   public ResponseEntity Dividiendo (String num1, String num2){
        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);
        double resultado = numero1 / numero2;
        return ResponseEntity.ok(implementSaludo.getSaludo() +"\n" +calculadoraConfig.getDivide() + " " + resultado);
    }

    }
