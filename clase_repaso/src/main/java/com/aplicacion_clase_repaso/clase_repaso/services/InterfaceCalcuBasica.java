package com.aplicacion_clase_repaso.clase_repaso.services;

import org.springframework.http.ResponseEntity;

public interface InterfaceCalcuBasica {

    ResponseEntity Multiplicando(String num1, String num2);

    ResponseEntity Dividiendo (String num1, String num2);



}
