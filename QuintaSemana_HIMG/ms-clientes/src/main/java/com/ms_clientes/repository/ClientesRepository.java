package com.ms_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ms_clientes.entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}