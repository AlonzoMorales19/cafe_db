package com.umg.cafe_db.repositories;

import com.umg.cafe_db.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
