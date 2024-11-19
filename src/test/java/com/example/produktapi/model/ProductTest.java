package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    // Made by: Jarko Piironen
    public void testGetImage() {
        // Create a Product instance using a default constructor.
        Product product = new Product();

        // Define the image to be set.
        String expectedImage = "https://www.iths.se/wp-content/themes/stella/assets/images/logo.svg";

        // Act: Set the image and retrieve it using the getter.
        product.setImage(expectedImage);
        String actualImage = product.getImage();

        // Assert: Verify that the getter returns the correct image.
        assertEquals(expectedImage, actualImage, "The image URL should match the expected value.");
    }
}
