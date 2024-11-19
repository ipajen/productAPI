package com.example.produktapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    // Made by: Jarko Piironen
    public void testSetImage() {
        // Create a Product instance using a default constructor.
        Product product = new Product();

        // Define the new image URL to be set.
        String newImage = "https://www.iths.se/wp-content/uploads/2022/03/thumbnails/marcusithogskolan-4318-1280x450.png";

        // Act: Invoke the method under test to set the image.
        product.setImage(newImage);

        // Retrieve the image to verify the result.
        String actualImage = product.getImage();

        // Assert: Verify that the method behaves as expected.
        assertEquals(newImage, actualImage, "The image URL should be updated to the new value.");
    }
}
