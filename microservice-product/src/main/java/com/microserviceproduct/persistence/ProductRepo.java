package com.microserviceproduct.persistence;

import com.microserviceproduct.entities.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Producto, Long> {
}
