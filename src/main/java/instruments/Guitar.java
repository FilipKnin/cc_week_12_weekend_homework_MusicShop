package instruments;

import interfaces.ISell;

public class Guitar extends Instrument implements ISell {

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

    @Override
    public double calculateMarkup() {
            return getSellingPrice() - getBuyingPrice();
        }

}
