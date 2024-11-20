package com.example.tarea.repository;

import com.example.tarea.entity.ProductosODA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<ProductosODA, Long> {
}
