package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {

        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int countStockItems() {
        return this.stock.size();
    }
}
