import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("guitar strings", "Brand", 15.00, 30.00);
    }

    @Test
    public void hasType() {
        assertEquals("guitar strings", guitarStrings.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Brand", guitarStrings.getBrand());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(15, guitarStrings.getBuyingPrice(),0.01);
    }

    @Test
    public void canSetBuyingPrice() {
        guitarStrings.setBuyingPrice(20.00);
        assertEquals(20.00, guitarStrings.getBuyingPrice(),0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(30.00, guitarStrings.getSellingPrice(),0.01);
    }

    @Test
    public void canSetSellingPrice() {
        guitarStrings.setSellingPrice(20.00);
        assertEquals(20.00, guitarStrings.getSellingPrice(),0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(15.00, guitarStrings.calculateMarkup(),0.01);
    }
}
