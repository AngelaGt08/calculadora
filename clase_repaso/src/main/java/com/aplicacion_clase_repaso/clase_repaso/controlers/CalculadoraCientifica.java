package com.aplicacion_clase_repaso.clase_repaso.controlers;

import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceCalcuCientifica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;
@Service

@RestController
@RequestMapping
public class CalculadoraCientifica {
    private final InterfaceCalcuCientifica calcularCient;
    private final CalculadoraConfig config;


    public CalculadoraCientifica(CalculadoraConfig config, InterfaceCalcuCientifica calcularCient){
        this.config = config;
        this.calcularCient = calcularCient;
    }

    @GetMapping("/factorial/{numero}")
    public ResponseEntity  getfactorial(@PathVariable String numero) {
        return calcularCient.factorial(numero);
    }
}