import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before() {
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

}
