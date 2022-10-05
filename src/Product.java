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

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public Product(String productName, double productPrice) {
        setProductName(productName);
        setProductPrice(productPrice);
    }

    public String toString() {
        return "Product{productName='" + productName + "', productPrice=" + productPrice + "}";
    }
}