package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
        @Test
        // Made by: Jarko Piironen
        public void testSetDescription() {
            // Create a Product instance using a default constructor.
            Product product = new Product();

            // Define the new description to be set.
            String newDescription = "Updated product description.";

            // Act: Invoke the method under test.
            product.setDescription(newDescription);

            // Assert: Verify that the method behaves as expected.
            assertEquals(newDescription, product.getDescription(), "The description should be updated to the new value.");
        }
    }

