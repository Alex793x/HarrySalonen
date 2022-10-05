public class Product {
    private String productName;
    private double productPrice;

    public Product() {
    }

    public String getProductName() {
        return this.productName;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductName(String product) {
        this.productName = product;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Product(String productName, double productPrice) {
        setProductName(productName);
        setProductPrice(productPrice);
    }

    public String toString() {
        return "Product{productName='" + productName + "', productPrice=" + productPrice + "}";
    }
}