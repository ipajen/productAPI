import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.produktapi.model.Product;
import org.junit.jupiter.api.Test;

public class SetDescriptionTest {
    // Made by: Jarko Piironen

    @Test
    public void testSetDescription() {
        // Create a Product instance with an initial description.
        Product product = new Product("Sample Product", 99.99, "Electronics", "Initial description", "image_url");

        // Define the new description to be set.
        String newDescription = "Updated product description.";

        // Act: Invoke the method under test.
        product.setDescription(newDescription);

        // Assert: Verify that the method behaves as expected.
        assertEquals(newDescription, product.getDescription(), "The description should be updated to the new value.");
    }
}
