package com.aplicacion_clase_repaso.clase_repaso.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "calculadora")


public class CalculadoraConfig {
    private String operacion;
    public String getOperacion(){
        return operacion;
    }
    public void setOperacion(String operacion) {
        this.operacion = operacion;
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

    private String multiplo;
    public String getMultiplo() {
        return multiplo;
    }
    public void setMultiplo(String multiplo) {
        this.multiplo = multiplo;
    }


}

