package tests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("book_tests")
public class BookTests {

    @Test
    public void bookTest() {
        assertEquals(5, 5);
    }

    @Test
    public void parametrizedStringTest() {
        String b = System.getProperty("page");
        String expected = "title";

        assertEquals(expected, b);
    }

    @Test
    public void parametrizedIntTest() {
        int b = Integer.parseInt(System.getProperty("3"));
        int expected = 3;

        assertEquals(expected, b);
    }
}





