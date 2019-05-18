package com.electronicxs.demo.Repository;

import com.electronicxs.demo.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    public Cliente findByNombreCli(String nombreCli);
}
