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

    // Author: Ingela Bladh
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

    // Author: Ingela Bladh
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

    // Author: Ingela Bladh
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

    // Author: Ingela Bladh
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
