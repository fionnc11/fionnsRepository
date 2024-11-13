import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class ColourTableTest {
    @Test
    public void testConstructorValidSize() {
        ColourTable table = new ColourTable(4);
        assertNotNull(table);
    }

    @Test
    public void testConstructorWithoutParameterPassed() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable());
    }
}
