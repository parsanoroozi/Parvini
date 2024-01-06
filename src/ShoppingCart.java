import java.util.ArrayList;

public class ShoppingCart {
    private int itemCount;
    private double totalPrice;
    private ArrayList<ShoppingCartItem> items;
    private int customerId;

    { // initialization block
        System.out.println("initializing block is running");
    }

    public ShoppingCart(){items = new ArrayList<ShoppingCartItem>();}
    public ShoppingCart(int customerId){
        this();
        this.customerId = customerId;
    }

    public void addItem(ShoppingCartItem item) {items.add(item);}
    public void removeItem(ShoppingCartItem item){items.remove(item);}

    public int getItemCount() {
        return items.size();
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ArrayList<ShoppingCartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<ShoppingCartItem> items) {
        this.items = items;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
