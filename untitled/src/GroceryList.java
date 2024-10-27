import java.util.ArrayList;

class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = 1; // Default quantity is 1
    }

    public double getCost() {
        return quantity * pricePerUnit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + quantity + " @ $" + pricePerUnit + " each, total cost = $" + getCost();
    }
}

class GroceryList {
    private ArrayList<GroceryItemOrder> items;

    public GroceryList() {
        items = new ArrayList<>();
    }

    public void add(GroceryItemOrder item) {
        if (items.size() < 10) {
            items.add(item);
        } else {
            System.out.println("Cannot add more than 10 items to the grocery list.");
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (GroceryItemOrder item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (GroceryItemOrder item : items) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Total cost: $").append(getTotalCost());
        return sb.toString();
    }
}