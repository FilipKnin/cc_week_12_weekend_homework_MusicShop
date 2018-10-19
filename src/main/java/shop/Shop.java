package shop;

import interfaces.ISell;
import items.DrumSticks;

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

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        int removedItemIndex = this.stock.indexOf(item);
        this.stock.remove(removedItemIndex);
    }

    public double calculateProfit() {
        double profit = 0;

        for (int i = 0; i <this.stock.size() ; i++) {
           ISell stockItem = this.stock.get(i);
           double markup = stockItem.calculateMarkup();
           profit += markup;
        }

        return profit;
    }
}
