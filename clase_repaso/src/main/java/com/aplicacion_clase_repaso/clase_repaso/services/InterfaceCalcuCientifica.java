package com.aplicacion_clase_repaso.clase_repaso.services;

import org.springframework.http.ResponseEntity;

public interface InterfaceCalcuCientifica {

    ResponseEntity factorial (String numero);

    ResponseEntity multiplos (String numero);

    ResponseEntity coseno (String numero);

    ResponseEntity raizCuadrada (String numero);

    ResponseEntity radio (String numero);
}
