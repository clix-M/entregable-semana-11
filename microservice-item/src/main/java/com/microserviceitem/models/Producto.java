package com.microserviceitem.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
    private Long id;
    private String nombre;
    private Double precio;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createAt;
}
