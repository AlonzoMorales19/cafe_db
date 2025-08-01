package com.umg.cafe_db.repositories;

import com.umg.cafe_db.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
