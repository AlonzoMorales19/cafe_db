package com.umg.cafe_db.repositories;

import com.umg.cafe_db.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
