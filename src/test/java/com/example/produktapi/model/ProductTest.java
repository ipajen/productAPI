package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    // Author: Jarko Piironen
    @Test
    public void testGetDescription() {
        // Define the expected description for the product.
        String expectedDescription = "A sample product description.";

        // Create a Product instance using a default constructor.
        Product product = new Product();

        // Set the description of the product.
        product.setDescription(expectedDescription);

        // Retrieve the actual description from the Product instance using the getDescription() method.
        String actualDescription = product.getDescription();

        // Assert: Verify that the method behaves as expected.
        assertEquals(expectedDescription, actualDescription, "The description should match the expected value.");
    }
}
