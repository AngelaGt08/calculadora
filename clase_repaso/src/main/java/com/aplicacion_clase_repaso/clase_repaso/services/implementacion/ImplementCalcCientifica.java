package com.aplicacion_clase_repaso.clase_repaso.services.implementacion;

import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceCalcuCientifica;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ImplementCalcCientifica implements InterfaceCalcuCientifica {

    CalculadoraConfig calculadoraConfig;

    public ImplementCalcCientifica(CalculadoraConfig calculadoraConfig) {
        this.calculadoraConfig = calculadoraConfig;
    }

    @Override
    public ResponseEntity factorial(String numero) {
        return null;
    }

    @Override
    public ResponseEntity multiplos(String numero) {
        return null;
    }

    @Override
    public ResponseEntity coseno(String numero) {
        return null;
    }

    @Override
    public ResponseEntity raizCuadrada(String numero) {
        return null;
    }

    @Override
    public ResponseEntity radio(String numero) {
        return null;
    }
/*
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
    }*/
}
