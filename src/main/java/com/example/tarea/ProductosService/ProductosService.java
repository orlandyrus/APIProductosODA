package com.example.tarea.ProductosService;

import com.example.tarea.entity.ProductosODA;
import com.example.tarea.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {
    @Autowired
    ProductosRepository productosRepository;

    public List<ProductosODA> getProductos(){
        return productosRepository.findAll();
    }

    public Optional<ProductosODA> getProductos(Long id){
        return productosRepository.findById(id);
    }

    public void saveOrUpdate(ProductosODA productosODA){
        productosRepository.save(productosODA);
    }

    public void delete(Long id){
        productosRepository.deleteById(id);
    }
}
