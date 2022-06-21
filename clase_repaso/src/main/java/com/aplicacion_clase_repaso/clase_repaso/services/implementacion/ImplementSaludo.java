package com.aplicacion_clase_repaso.clase_repaso.services.implementacion;


import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceSaludo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Calendar;


@Service
public class ImplementSaludo implements InterfaceSaludo {

    Calendar calendario =Calendar.getInstance();
    CalculadoraConfig calculadoraConfig;
    public ImplementSaludo(CalculadoraConfig calculadoraConfig) {
        this.calculadoraConfig = calculadoraConfig;
    }

    @Override
    public ResponseEntity getSaludo(){
        int hora= calendario.get(Calendar.HOUR_OF_DAY);
        String mensajeSaludo = "";
        if(hora<12) {
            mensajeSaludo = calculadoraConfig.getManana();

        }else if (hora > 12 && hora < 18) {
            mensajeSaludo = calculadoraConfig.getTarde();

        }else  if (hora > 18 && hora < 23)
            mensajeSaludo = calculadoraConfig.getNoche();

        return ResponseEntity.ok(mensajeSaludo);
    }



}
