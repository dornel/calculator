package com.dorneleduardo.Calculator.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubController extends CalcController {

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)

    private Double Numbers(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo){

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){

            throw new UnsupportedOperationException("Caracter Inválido");
        }

        return convertToDouble(numberOne)-convertToDouble(numberTwo);

    }



}
