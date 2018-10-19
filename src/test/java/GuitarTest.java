import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Brand", "Model", InstrumentType.Strings,10, 1000.00, 2000.00);
    }

    @Test
    public void hasBrand() {
        assertEquals("Brand", guitar.getBrand());
    }

}
