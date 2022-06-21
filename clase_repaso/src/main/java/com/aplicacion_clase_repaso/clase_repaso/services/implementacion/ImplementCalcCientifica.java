package com.aplicacion_clase_repaso.clase_repaso.services.implementacion;

import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceCalcuCientifica;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ImplementCalcCientifica implements InterfaceCalcuCientifica {

    CalculadoraConfig calculadoraConfig;
    public ImplementCalcCientifica (CalculadoraConfig calculadoraConfig){
        this.calculadoraConfig = calculadoraConfig;
    }

    @Override
    public ResponseEntity getFactorial(String numero){
        String advertencia = "";

        if(ImplementValidarDatos.siNumero(numero)){
            int num1 = Integer.parseInt(numero);
            int resultado = 1;
            for(int i=num1; i >= 2; i--){
                resultado *= i;
            }
            advertencia = numero + ": "+ resultado;
        }else {
            advertencia = "El Valor ingresado no es un número";
        }
        return ResponseEntity.ok(calculadoraConfig.getFactor() +" " + advertencia);
    }

    @Value("${calculadora.opcion.numero}")
    private int numMax;
    @Override
    public ResponseEntity getMultiplos(String numero){
        String advertencia = "";
        if(ImplementValidarDatos.siNumero(numero)){
            double num1 = Double.parseDouble(numero);
            for(double i = 1.0; i <= numMax; i++){
                double resultado = num1 * i;
                advertencia += num1 + " * " + i + " = " + resultado + "\n";
            }
        }else{
            advertencia = "El Valor ingresado no es un número";
        }
        return ResponseEntity.ok(calculadoraConfig.getMultiplos()+ "\n" + advertencia);
    }

    @Override
    public ResponseEntity getCoseno(String numero){
        String advertencia = "";
        if(ImplementValidarDatos.siNumero(numero)){
            double num1 = Math.toRadians(Double.parseDouble(numero));
            double resultado = Math.cos(num1);
            advertencia = "cos("+numero+") = "+ resultado;
        }else{
            advertencia = "El Valor ingresado no es un número";
        }
        return ResponseEntity.ok(calculadoraConfig.getCoseno()+ advertencia);
    }

    @Override
    public ResponseEntity getRaizCuadrada(String numero){
        String advertencia = "";
        if(ImplementValidarDatos.siNumero(numero)){
            if(Double.parseDouble(numero) < 0.0){
                advertencia = "Número complejo";
            }else {
                double num1 = Math.sqrt(Double.parseDouble(numero));
                advertencia = numero+" = "+num1;
            }
        }else {
            advertencia = "El Valor ingresado no es un número";
        }
        return ResponseEntity.ok(calculadoraConfig.getRaiz() + advertencia);
    }
    @Override
    public ResponseEntity getRadio(String radio){
        String advertencia = "";
        if(ImplementValidarDatos.siNumero(radio)){
            if(Double.parseDouble(radio) < 0.0){
                advertencia = "El radio debe ser un número +";
            }else {
                double superficie = Math.PI * (Math.pow(Double.parseDouble(radio),2));
                advertencia = " " + superficie;
            }
        }else {
            advertencia = "El Valor ingresado no es un número";
        }
        return ResponseEntity.ok(calculadoraConfig.getRadio() + advertencia);
    }


    }




