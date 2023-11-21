package com.microserviceproduct.service;

import com.microserviceproduct.entities.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);
}
