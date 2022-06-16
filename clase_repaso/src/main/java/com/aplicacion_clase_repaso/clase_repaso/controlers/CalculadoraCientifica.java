package com.aplicacion_clase_repaso.clase_repaso.controlers;

import com.aplicacion_clase_repaso.clase_repaso.config.CalculadoraConfig;
import com.aplicacion_clase_repaso.clase_repaso.services.InterfaceCalcuCientifica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;

import javax.websocket.server.PathParam;

@Service

@RestController
@RequestMapping
public class CalculadoraCientifica {
    private final InterfaceCalcuCientifica interfaceCalcuCientifica;

    public CalculadoraCientifica(CalculadoraConfig config, InterfaceCalcuCientifica interfaceCalcuCientifica){
                this.interfaceCalcuCientifica = interfaceCalcuCientifica;
    }

    @GetMapping("/factorial/{numero}")
<<<<<<< HEAD
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
=======
    public ResponseEntity  getfactorial(@PathVariable String numero) {
        return calcularCient.factorial(numero);
    }
}
>>>>>>> 7faa03b4adf889a571d4e7c37c997d36f0960e92
