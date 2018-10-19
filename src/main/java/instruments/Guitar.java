package instruments;

public class Guitar extends Instrument {

    private int numOfStrings;


    public Guitar(String brand, String model, InstrumentType type, int numOfStrings, double buyingPrice, double sellingPrice) {
        super(brand, model, type, buyingPrice, sellingPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return this.numOfStrings;
    }

    @Override
    public String playInstrument() {
        return "Ty ty ry ty ty ty ty";
    }
}
