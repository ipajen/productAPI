package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ProductTest {
   //Barnali Test
    @Test
    void testSetCategory() {
        Product product = new Product();

        // Act: Set the category
        product.setCategory("Furniture");

        // Assert: Ensure the category is set correctly
        assertEquals("Furniture", product.getCategory());
    }

}