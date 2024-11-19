package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test

    void testGetPrice() {
        Product product = new Product();

        // Arrange: Set a known price
        product.setPrice(159.99);

        // Act & Assert: Ensure the getter returns the correct value
        assertEquals(159.99, product.getPrice());
    }


}