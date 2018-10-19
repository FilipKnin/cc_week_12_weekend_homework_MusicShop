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

    @Test
    public void hasModel() {
        assertEquals("Model", guitar.getModel());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.Strings, guitar.getType());
    }

    @Test
    public void hasNumOfStrings() {
        assertEquals(10, guitar.getNumOfStrings());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(1000.00, guitar.getBuyingPrice(),0.01);
    }

    @Test
    public void canSetBuyingPrice() {
        guitar.setBuyingPrice(1500.00);
        assertEquals(1500.00, guitar.getBuyingPrice(),0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(2000., guitar.getSellingPrice(),0.01);
    }

    @Test
    public void canSetSellingPrice() {
        guitar.setSellingPrice(3000.00);
        assertEquals(3000.00, guitar.getSellingPrice(),0.01);
    }

    @Test
    public void canBePlayed() {
        assertEquals("Ty ty ry ty ty ty ty", guitar.playInstrument());
    }

}
