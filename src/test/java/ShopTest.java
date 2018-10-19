import items.DrumSticks;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("drum sticks", "Brand", 15.00, 30.00);
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

}
