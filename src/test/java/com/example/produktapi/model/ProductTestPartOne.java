package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTestPartOne {

    @Test
    public void test_Product_empty_constructor() {
        // Act
        Product product = new Product();

        // Assert
        assertNotNull(product);
        assertNull(product.getTitle());
        assertNull(product.getPrice());
        assertNull(product.getCategory());
        assertNull(product.getDescription());
        assertNull(product.getImage());
    }

    @Test
    public void test_Product(){
        // Setup
        String productName = "product1";
        Double price = 5.99;
        String category = "cat1";
        String description = "desc1";
        String image = "img1";

        // Act
        Product product = new Product(productName, price, category, description, image);

        // Assert
        assertEquals(productName, product.getTitle());
        assertEquals(price, product.getPrice());
        assertEquals(category, product.getCategory());
        assertEquals(description, product.getDescription());
        assertEquals(image, product.getImage());
    }

    @Test
    public void test_getId_setId(){
        // Setup
        Integer productId = 1;
        Product product = new Product();
        product.setId(productId);

        // Act
        // Assert
        assertEquals(productId, product.getId());
    }

    @Test
    public void test_getTitle_setTitle(){
        // Setup
        String title = "title";
        Product product = new Product();
        product.setTitle(title);

        // Act
        // Assert
        assertEquals(title, product.getTitle());
    }

}