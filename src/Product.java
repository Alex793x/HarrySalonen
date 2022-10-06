public class Product {
    private String productName;
    private double productPrice;
    private int productAmount;

    // GETTER --------------------------------------
    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }
    // SETTER --------------------------------------
    public void setProductName(String product) {
        this.productName = product;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductAmount() {
        this.productAmount++;
    }

    public Product(String productName, double productPrice) {
        setProductName(productName);
        setProductPrice(productPrice);
    }

    public String toString() {
        return "Produkt: " + productName + ", Pris: " + productPrice + ".-" + " Antal: " + productAmount + " ";
    }
}