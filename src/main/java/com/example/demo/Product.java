package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@JsonProperty("productid")
    private Integer id;
	@JsonProperty("productname")
    private String name;
	@JsonProperty("productprice")
    private double price;

    public Product(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
