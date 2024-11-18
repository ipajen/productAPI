import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.produktapi.model.Product;
import org.junit.jupiter.api.Test;

public class GetDescriptionTest {

    // Made by: Jarko Piironen

    @Test
    public void testGetDescription() {
        // Define the expected description for the product.
        String expectedDescription = "A sample product description.";

        // The constructor initializes the product with a title, price, category, description, and image.
        Product product = new Product("Sample Product", 99.99, "Electronics", expectedDescription, "image_url");

        // Retrieve the actual description from the Product instance using the getDescription() method.
        String actualDescription = product.getDescription();

        // Assert: Verify that the method behaves as expected.
        assertEquals(expectedDescription, actualDescription, "The description should match the expected value.");
    }
}


