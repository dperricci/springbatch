package com.springbatch.jdbccursorreader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbatch.jdbccursorreader.dominio.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
