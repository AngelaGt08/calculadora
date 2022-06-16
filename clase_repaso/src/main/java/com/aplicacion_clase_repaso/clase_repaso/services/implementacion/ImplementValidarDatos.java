package com.aplicacion_clase_repaso.clase_repaso.services.implementacion;

public class ImplementValidarDatos {

    public static boolean siNumero(String num){
        boolean siNumero = true;
        int contadorPunto = 0;
        int contadorGuion = 0;
        char[] numArreglo = num.toCharArray();

        for(char c:numArreglo){
            if(Character.isDigit(c)){
                continue;
            }else if(c == '.'){
                contadorPunto++;
            }else if(c == '-'){
                contadorGuion++;
            }else{
                siNumero = false;
                break;
            }
        }
        if(contadorPunto > 1 || contadorGuion > 1){
            siNumero = false;
        }
        if(num.startsWith(".")||num.endsWith(".")){
            siNumero = false;
        }
        if(contadorGuion == 1){
            if(!num.startsWith("-")){
                siNumero = false;
            }
        }
        return siNumero;
    }
}
