import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {
    @Test
    public void testWordBucket() {
        Main main = new Main();
        String[] expected = {"she sells", "sea shells", "by the sea"};
        String[] result = main.wordBucket("she sells sea shells by the sea", 10);

        assertArrayEquals(expected, result, "The wordBucket method did not return the expected buckets.");
    }
}
