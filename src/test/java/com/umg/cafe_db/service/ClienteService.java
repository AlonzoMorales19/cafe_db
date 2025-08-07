package com.umg.cafe_db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.umg.cafe_db.repositories.ClienteRepository;
import com.umg.cafe_db.entities.Cliente;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clientesRepository;

    public Cliente saveClientes(Cliente client) {
        return clientesRepository.save(client);
    }
}
