package com.microserviceitem.service;

import com.microserviceitem.models.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
