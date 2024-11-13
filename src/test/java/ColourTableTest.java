import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTableTest {
    @Test
    public void testConstructorValidSize() {
        ColourTable table = new ColourTable(4);
        assertNotNull(table);
    }
}
