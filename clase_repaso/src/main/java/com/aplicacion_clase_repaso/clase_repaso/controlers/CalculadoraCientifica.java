package com.aplicacion_clase_repaso.clase_repaso.controlers;

import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceCalcuCientifica;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceSaludo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service

@RestController
@RequestMapping

public class CalculadoraCientifica {
    private final InterfaceCalcuCientifica interfaceCalcuCientifica;
    private final CalculadoraConfig calculadoraConfig;

    public CalculadoraCientifica(InterfaceCalcuCientifica interfaceCalcuCientifica, CalculadoraConfig calculadoraConfig){
        this.interfaceCalcuCientifica = interfaceCalcuCientifica;
        this.calculadoraConfig = calculadoraConfig;

    }
    String mensajeSaludo ="";

    @GetMapping("/factorial/{numero}")
    public ResponseEntity getFactorial(@PathVariable String numero){
        return interfaceCalcuCientifica.getFactorial(numero);
    }

    @GetMapping("/multiplos/{numero}")
    public ResponseEntity getMultiplos(@PathVariable String numero){
        return interfaceCalcuCientifica.getMultiplos(numero);
    }

    @GetMapping("/coseno/{numero}")
    public ResponseEntity getCoseno(@PathVariable String numero){
        return interfaceCalcuCientifica.getCoseno(numero);
    }

    @GetMapping("/raiz/{numero}")
    public ResponseEntity getRaizCuadrada(@PathVariable String numero){
        return interfaceCalcuCientifica.getRaizCuadrada(numero);
    }

    @GetMapping("/radio/{numero}")
    public ResponseEntity getRadio(@PathVariable String numero){
        return interfaceCalcuCientifica.getRadio(numero);
    }






}
