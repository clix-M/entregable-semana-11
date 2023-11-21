package com.microserviceitem.models;

import com.microserviceitem.client.ProductoClienteRest;
import com.microserviceitem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceFeign")
@Primary
public class ItemServiceFeign implements ItemService {

    @Autowired
    private ProductoClienteRest clienteFeign;
    @Override
    public List<Item> findAll() {
        return clienteFeign.listar().stream().map(p -> new Item(p,1)).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return new Item(clienteFeign.detalle(id),cantidad);
    }
}
