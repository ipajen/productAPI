package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getCategoryTest() {

            // Initialize the product
            Product product = new Product();

            // Arrange: Set a known category
            product.setCategory("Books");

            // Act & Assert: Ensure the getter returns the correct value
            assertEquals("Books", product.getCategory());
        }
    }
