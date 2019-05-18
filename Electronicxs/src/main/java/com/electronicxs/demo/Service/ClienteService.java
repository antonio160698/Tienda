package com.electronicxs.demo.Service;

import com.electronicxs.demo.Models.Cliente;
import com.electronicxs.demo.Repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ClienteService {
    private final ClienteRepository clienterepository;

    public ClienteService(ClienteRepository clienterepository){this.clienterepository = clienterepository;}
    @Transactional
    public Cliente create(Cliente cliente){return this.clienterepository.save(cliente);}
}
