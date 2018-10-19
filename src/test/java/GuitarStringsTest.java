import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("guitar strings", "Brand", 15, 30);
    }

    @Test
    public void hasType() {
        assertEquals("guitar strings", guitarStrings.getType());
    }
}
