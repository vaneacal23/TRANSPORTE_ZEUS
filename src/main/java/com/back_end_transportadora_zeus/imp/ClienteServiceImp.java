package com.back_end_transportadora_zeus.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back_end_transportadora_zeus.model.Cliente;
import com.back_end_transportadora_zeus.repository.ClienteRepository;
import com.back_end_transportadora_zeus.service.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getClientes(){
        return (List) this.clienteRepository.findAll();
    }
}
