package items;

public class DrumSticks extends Item {

    public DrumSticks(String type, String brand, double buyingPrice, double sellingPrice) {
        super(type, brand, buyingPrice, sellingPrice);
    }


    @Override
    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
