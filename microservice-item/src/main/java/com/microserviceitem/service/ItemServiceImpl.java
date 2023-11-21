package com.microserviceitem.service;

import com.microserviceitem.models.Item;
import com.microserviceitem.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate clientRest;
    @Override
    public List<Item> findAll() {
        List<Producto> productos= Arrays.asList(clientRest.getForObject("http://localhost:9090/listar", Producto[].class));
        return productos.stream().map(p -> new Item(p,
                1)).collect(Collectors.toList());

    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        Map<String,String> pathVariables = new HashMap<String,String>();
        pathVariables.put("id", id.toString());
        Producto producto=clientRest.getForObject("http://localhost:9090/ver/{id}", Producto.class, pathVariables);
        return new Item(producto,cantidad);
    }
}
