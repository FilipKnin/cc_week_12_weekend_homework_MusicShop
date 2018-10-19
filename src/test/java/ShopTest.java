import instruments.Guitar;
import instruments.InstrumentType;
import items.DrumSticks;
import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    Guitar guitar;


    @Before
    public void before() {
        drumSticks = new DrumSticks("drum sticks", "Brand", 15.00, 30.00);
        guitarStrings = new GuitarStrings("guitar strings", "Brand", 15.00, 30.00);
        guitar = new Guitar("Brand", "Model", InstrumentType.Strings,10, 1000.00, 2000.00);
        shop = new Shop("name");
    }

    @Test
    public void hasName() {
        assertEquals("name", shop.getName());
    }

    @Test
    public void canCountStockItems() {
        assertEquals(0, shop.countStockItems());
    }

    @Test
    public void canAddStockItem() {
        shop.addItem(drumSticks);
        assertEquals(1, shop.countStockItems());
    }

    @Test
    public void canRemoveItem() {
        shop.addItem(drumSticks);
        shop.addItem(guitarStrings);
        shop.removeItem(drumSticks);
        assertEquals(1, shop.countStockItems());
    }

    @Test
    public void canCalculatePotentialProfit() {
        shop.addItem(drumSticks);
        shop.addItem(guitarStrings);
        shop.addItem(guitar);
        assertEquals(1030.00, shop.calculateProfit(), 0.01);
    }

}
