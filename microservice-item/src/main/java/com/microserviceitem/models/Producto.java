package com.microserviceitem.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
    private Long id;
    private String nombre;
    private Double precio;
    private Date createAt;
}
