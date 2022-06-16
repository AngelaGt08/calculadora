package com.aplicacion_clase_repaso.clase_repaso.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "calculadora.opcion")


public class CalculadoraConfig {
    private String reste;
    public String getReste(){
        return reste;
    }
    public void setReste(String reste) {
        this.reste = reste;
    }

    private String multiplique;
    public String getMultiplique(){
        return multiplique;
    }
    public void setMultiplique(String multiplique){
        this.multiplique = multiplique;
    }
    private String divide;
    public String getDivide(){
        return divide;
    }
    public void setDivide(String divide){
        this.divide = divide;
    }

    private String factor;
    public String getFactor() {
        return factor;
    }
    public void setFactor(String factor) {
        this.factor = factor;
    }

    private String multiplos;
    public String getMultiplos() {
        return multiplos;
    }
    public void setMultiplos(String multiplos) {
        this.multiplos = multiplos;
    }

    private String coseno;
    public String getCoseno() {
        return coseno;
    }
    public void setCoseno(String coseno) {
        this.coseno = coseno;
    }

    private String raiz;
    public String getRaiz() {
        return raiz;
    }
    public void setRaiz(String raiz) {
        this.raiz = raiz;
    }

    private String radio;
    public String getRadio() {
        return radio;
    }
    public void setRadio(String radio) {
        this.radio = radio;
    }


}

