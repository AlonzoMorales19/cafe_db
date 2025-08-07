package com.umg.cafe_db.controller;

import com.umg.cafe_db.entities.Cliente;
import com.umg.cafe_db.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente saveClientes(@RequestBody Cliente cliente) {
        return clienteService.saveClientes(cliente);
    }
}