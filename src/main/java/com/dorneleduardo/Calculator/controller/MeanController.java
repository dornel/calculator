package com.dorneleduardo.Calculator.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeanController extends CalcController{

    @RequestMapping(value = ("/mean/{numberOne}/{numberTwo}"), method = RequestMethod.GET)

    public Double numbers(@PathVariable (value = "numberOne") String numberOne , @PathVariable(value = "numberTwo") String numberTwo){

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){

            throw new UnsupportedOperationException("Caracter inválido");
        }
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;


    }



}
