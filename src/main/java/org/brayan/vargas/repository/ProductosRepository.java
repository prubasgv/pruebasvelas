package org.brayan.vargas.repository;

import org.brayan.vargas.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository <Producto, Integer> {

}
