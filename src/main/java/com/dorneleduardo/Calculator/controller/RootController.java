package com.dorneleduardo.Calculator.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController extends CalcController {

    @RequestMapping(value = ("/root/{number}"), method = RequestMethod.GET)

    public Double root(@PathVariable(value = "number") String number){

        if (!isNumeric(number)){

            throw new UnsupportedOperationException("Caracter inválido");

        }
        return Math.sqrt(convertToDouble(number));

    }



}
