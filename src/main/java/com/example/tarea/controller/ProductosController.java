package com.example.tarea.controller;

import com.example.tarea.ProductosService.ProductosService;
import com.example.tarea.entity.ProductosODA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/productos")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @GetMapping
    public List<ProductosODA> getAll(){
        return  productosService.getProductos();
    }

    @GetMapping("/{productoId}")
    public Optional<ProductosODA> getById(@PathVariable("productoId") Long productoId){
        return  productosService.getProductos(productoId);
    }

    @PostMapping
    public ProductosODA saveUpdate(@RequestBody ProductosODA productosODA){
        productosService.saveOrUpdate(productosODA);
        return productosODA;
    }

    @DeleteMapping("/{productoId}")
    public void saveUpdate(@PathVariable("productoId") Long productoId){
        productosService.delete(productoId);
    }

}

