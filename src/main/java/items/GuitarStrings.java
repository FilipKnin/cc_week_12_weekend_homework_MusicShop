package items;

public class GuitarStrings extends Item {

    public GuitarStrings(String type, String brand, double buyingPrice, double sellingPrice) {
        super(type, brand, buyingPrice, sellingPrice);
    }

    @Override
    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
