package instruments;

public abstract class Instrument {

    private String brand;
    private String model;
    private InstrumentType type;
    private double price;


    public Instrument(String brand, String model, InstrumentType type, double price) {

        this.brand = brand;
        this.model= model;
        this.type = type;
        this.price = price;
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

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
