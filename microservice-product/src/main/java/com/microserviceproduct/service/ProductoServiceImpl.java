package com.microserviceproduct.service;

import com.microserviceproduct.entities.Producto;
import com.microserviceproduct.persistence.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productRepo.findAll();
    }

    @Override
    @Transactional
    public Producto findById(Long id) {
        return productRepo.findById(id).orElseThrow();
    }
}
