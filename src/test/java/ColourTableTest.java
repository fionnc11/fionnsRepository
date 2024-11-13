import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTableTest {
    @Test
    public void testConstructorValidSize() {
        //test for creating ColourTable objects
        ColourTable table = new ColourTable(4);
        assertNotNull(table);
    }

    @Test
    public void testConstructorWithoutParameterPassed() {
        //test to check exception handling
        assertThrows(IllegalArgumentException.class, () -> new ColourTable());
    }

    @Test
    public void testAddMethod() {
        ColourTable table = new ColourTable(2);

        //test it adds a colour to the palette
        table.add(50, 50, 50);
        table.add(150, 150, 150);

        assertEquals(2, table.size);
        assertEquals(new Color(50, 50, 50), table.palette.get(0));
    }

    @Test
    public void testAddExceptions() {
        ColourTable table = new ColourTable(2);
        //pass invalid parameters
        assertThrows(IllegalArgumentException.class, () -> {
            table.add(280, 250, 200);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            table.add(10, 12, -1);
        });
    }

    @Test
    public void testPaletteCapacityExceptions() {
        ColourTable table = new ColourTable(2);
        //add more colours than table can handle
        table.add(10, 10, 10);
        table.add(20, 20, 20);
        assertThrows(IndexOutOfBoundsException.class, ()->table.add(30,30,30));
    }

}

