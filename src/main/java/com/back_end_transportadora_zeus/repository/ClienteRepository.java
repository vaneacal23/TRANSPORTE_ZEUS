package com.back_end_transportadora_zeus.repository;

import org.springframework.data.repository.CrudRepository;
import com.back_end_transportadora_zeus.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    
} 
