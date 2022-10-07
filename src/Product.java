public class Product {
    private String productName;
    private double productPrice;
    private int productAmount;

    // GETTER -------------------------------------------------------------------
    public int getProductAmount() {
        return productAmount;
    }

    // SETTER --------------------------------------------------------------------
    public void setProductName(String product) {
        this.productName = product;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductAmount() {
        this.productAmount++;
    }

    // CONSTRUCTOR ------------------------------------------------------------------
    public Product(String productName, double productPrice) {
        setProductName(productName);
        setProductPrice(productPrice);
    }

    public String toString() {
        return "Produkt: " + productName + ", Pris: " + productPrice + ".-" + " Antal: " + productAmount + " ";
    }
}