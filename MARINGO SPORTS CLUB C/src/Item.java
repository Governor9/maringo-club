public class Item {
    private String itemName;
    private double price;
    private int stockLevel;

    // Constructors, getters, and setters

    public Item(String itemName, double price, int stockLevel) {
        this.itemName = itemName;
        this.price = price;
        this.stockLevel = stockLevel;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
}