package com.example.cuenta.controllers;

import java.util.ArrayList;

import com.example.cuenta.dto.CuentaDto;
import com.example.cuenta.models.CuentaModel;
import com.example.cuenta.services.CuentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {
    
    @Autowired
    CuentaService cuentaService; 


    @GetMapping
    public ArrayList<CuentaModel> getCuenta(){
        return cuentaService.getCuentas();
    } 

    @GetMapping("/datos")
    public ArrayList<CuentaDto> getCuentaBasica(){
        return cuentaService.getCuentaBasica();
    } 


    @PostMapping
    public CuentaModel guardarCuenta(@RequestBody CuentaModel cuenta){
        return cuentaService.setCuenta(cuenta);
    }
}
