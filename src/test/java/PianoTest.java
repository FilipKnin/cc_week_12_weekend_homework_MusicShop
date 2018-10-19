import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Brand", "Model", InstrumentType.Keyboard,"Black", 1000.00, 2000.00);
    }

    @Test
    public void hasBrand() {
        assertEquals("Brand", piano.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Model", piano.getModel());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.Keyboard, piano.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(1000.00, piano.getBuyingPrice(),0.01);
    }

    @Test
    public void canSetBuyingPrice() {
        piano.setBuyingPrice(1500.00);
        assertEquals(1500.00, piano.getBuyingPrice(),0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(2000., piano.getSellingPrice(),0.01);
    }

    @Test
    public void canSetSellingPrice() {
        piano.setSellingPrice(3000.00);
        assertEquals(3000.00, piano.getSellingPrice(),0.01);
    }

    @Test
    public void canBePlayed() {
        assertEquals("Tururururu", piano.playInstrument());
    }
}
