package items;

import interfaces.ISell;

public abstract class Item implements ISell {

    private String type;
    private String  brand;
    private double buyingPrice;
    private double sellingPrice;

    public Item(String type, String brand, double buyingPrice, double sellingPrice) {
        this.type = type;
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return this.type;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
