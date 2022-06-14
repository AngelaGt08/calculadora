package com.aplicacion_clase_repaso.clase_repaso.services.implementacion;

import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceCalcuBasica;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service


public class implementCalcBasica implements InterfaceCalcuBasica {

    @Value("${calculadora.multiplique}")
    String multi;

    CalculadoraConfig calculadoraConfig;
   public implementCalcBasica(CalculadoraConfig calculadoraConfig){
       this.calculadoraConfig = calculadoraConfig;
   }
    public ResponseEntity Multiplicando(String num1, String num2){
        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);
        double resultado = numero1 * numero2;
        return ResponseEntity.ok(multi + " " + resultado);
    }

   public ResponseEntity Dividiendo (String num1, String num2){
        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);
        double resultado = numero1 / numero2;
        return ResponseEntity.ok(calculadoraConfig.getDivide() + " " + resultado);
    }

    }
