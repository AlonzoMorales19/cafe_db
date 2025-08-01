package com.umg.cafe_db.repositories;

import com.umg.cafe_db.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
