package com.example.cuenta.services;

import java.util.ArrayList;

import com.example.cuenta.dto.CuentaDto;
import com.example.cuenta.models.CuentaModel;
import com.example.cuenta.repositories.CuentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaService {
    
    @Autowired
    CuentaRepository cuentaRepository;

    //Trae todos los datos de todas las cuentas
    public ArrayList<CuentaModel> getCuentas(){
        return (ArrayList<CuentaModel>) cuentaRepository.findAll();
    }


    public ArrayList<CuentaDto> getCuentaBasica(){

        //copia de getCuentas   ---> se asigna a la variable entidad
        ArrayList<CuentaModel> entidad= getCuentas();
        ArrayList<CuentaDto> datosBasicos= new ArrayList<CuentaDto>();

        for(CuentaModel cuenta: entidad){
            CuentaDto aux=new CuentaDto();
            aux.setId(cuenta.getId());
            aux.setNombre(cuenta.getNombre());
            aux.setEstado(cuenta.isEstado());
            aux.setMoneda(cuenta.getMoneda());
            datosBasicos.add(aux);
        }

        return datosBasicos;
    }

    public CuentaModel setCuenta(CuentaModel cuenta){
        return cuentaRepository.save(cuenta);
    }

    
}
