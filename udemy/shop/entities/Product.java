package udemy.shop.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;


    public Product(String name, double price, int quantity) {
       this.name = name; // Reference "this" to the object attribute
       this.price = price; // Reference "this" to the object attribute
       this.quantity = quantity; // Reference "this" to the object attribute
    }

   /* public Product(String name, double price) { // Overload
     *   this.name = name;
     *   this.price = price;
    }
    */

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){   
        return name 
        + ", $ " 
        + String.format("%.2f", price) + ", "
        + quantity + " units, Total: $ "  + String.format("%.2f", totalValueInStock());
    }
}
