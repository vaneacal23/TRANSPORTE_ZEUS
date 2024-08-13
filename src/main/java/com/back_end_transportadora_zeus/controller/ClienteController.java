package com.back_end_transportadora_zeus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back_end_transportadora_zeus.model.Cliente;
import com.back_end_transportadora_zeus.service.ClienteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Transactional
@RequestMapping({"/api"})
public class ClienteController{
    @Autowired
    private ClienteService clienteService;

    public ClienteController(){}

    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return this.clienteService.getClientes();
    }
    
}



