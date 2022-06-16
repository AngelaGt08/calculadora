package com.aplicacion_clase_repaso.clase_repaso.services;

import org.springframework.http.ResponseEntity;

public interface InterfaceCalcuCientifica {


    ResponseEntity getFactorial(String numero);

    ResponseEntity getMultiplos(String numero);

    ResponseEntity getCoseno(String numero);

    ResponseEntity getRaizCuadrada(String numero);

    ResponseEntity getRadio(String radio);
}
