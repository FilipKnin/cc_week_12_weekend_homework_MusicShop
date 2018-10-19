package instruments;

public class Piano extends Instrument {

    private String colour;

    public Piano(String brand, String model, InstrumentType type, String colour, double buyingPrice, double sellingPrice) {
        super(brand, model, type, buyingPrice, sellingPrice);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }
}
