package instruments;

public abstract class Instrument {

    private String brand;
    private String model;
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;


    public Instrument(String brand, String model, InstrumentType type, double buyingPrice, double sellingPrice ) {

        this.brand = brand;
        this.model= model;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public InstrumentType getType() {
        return this.type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
