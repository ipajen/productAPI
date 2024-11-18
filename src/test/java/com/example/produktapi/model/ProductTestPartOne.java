package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTestPartOne {

    @Test
    void getPrice() {

    }

    @Test
    //Barnali Test
    void setPrice() {
        Product product = new Product();

        // Act: Set the price
        product.setPrice(299.99);

        // Assert: Ensure the price is set correctly
        assertEquals(299.99, product.getPrice());
    }


    @Test
    void getCategory() {
    }

    @Test
    void setCategory() {
    }
}