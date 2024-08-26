package com.dorneleduardo.Calculator.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivController extends CalcController{

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}" , method = RequestMethod.GET)

    private Double numbers(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo){


        if ((!isNumeric(numberOne) || !isNumeric(numberTwo)) && ("0".equals(numberOne) || "0".equals(numberTwo))){

            throw new UnsupportedOperationException("Caracteres Inválidos");

        }

        return convertToDouble(numberOne) / convertToDouble(numberTwo);



    }







}
