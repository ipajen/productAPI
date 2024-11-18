package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTestPartOne {

    @Test
    void getPrice() {

    }

    @Test
    void setPrice() {
        Product product = new Product();
        product.setPrice(199.99);
        assertEquals(199.99, product.getPrice());
    }

    @Test
    void getCategory() {
    }

    @Test
    void setCategory() {
    }
}