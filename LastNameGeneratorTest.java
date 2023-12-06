import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class LastNameGeneratorTest {

    @Test
    public void testGenerateLastName() {
        String lastName = LastNameGenerator.generateLastName();
        assertTrue("Generated last name should not be empty", !lastName.isEmpty());
    }
}
