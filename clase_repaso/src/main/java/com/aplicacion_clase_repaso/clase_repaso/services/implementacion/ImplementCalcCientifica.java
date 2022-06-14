package com.aplicacion_clase_repaso.clase_repaso.services.implementacion;

import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import org.springframework.http.ResponseEntity;

public class ImplementCalcCientifica {

    CalculadoraConfig calculadoraConfig;
    public ImplementCalcCientifica(CalculadoraConfig calculadoraConfig){
        this.calculadoraConfig = calculadoraConfig;}

    public ResponseEntity factorial (String numero){

        int num1=Integer.parseInt(numero);
        int facto = 1;
        int resultado = 1;
        for (int i=num1; i==1;i--){

            if (num1==0){
                resultado=1;
            }
            resultado= facto * i;
          }
        return ResponseEntity.ok(resultado);
    }
    }
