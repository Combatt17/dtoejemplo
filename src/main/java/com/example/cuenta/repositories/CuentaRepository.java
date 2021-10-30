package com.example.cuenta.repositories;

import com.example.cuenta.models.CuentaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends CrudRepository<CuentaModel,Long>{
    
}
