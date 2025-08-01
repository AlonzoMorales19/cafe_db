package com.umg.cafe_db.repositories;

import com.umg.cafe_db.entities.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo, Integer> {
}
