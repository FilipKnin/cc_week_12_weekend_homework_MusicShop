import items.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("drum sticks", "Brand", 15.00, 30.00);
    }

    @Test
    public void hasType() {
        assertEquals("drum sticks", drumSticks.getType());
    }

    @Test
    public void hasBrand() {
        assertEquals("Brand", drumSticks.getBrand());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(15, drumSticks.getBuyingPrice(),0.01);
    }

    @Test
    public void canSetBuyingPrice() {
        drumSticks.setBuyingPrice(20.00);
        assertEquals(20.00, drumSticks.getBuyingPrice(),0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(30.00, drumSticks.getSellingPrice(),0.01);
    }

    @Test
    public void canSetSellingPrice() {
        drumSticks.setSellingPrice(20.00);
        assertEquals(20.00, drumSticks.getSellingPrice(),0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(15.00, drumSticks.calculateMarkup(),0.01);
    }
}
