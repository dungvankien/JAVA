package productManager;

import java.util.Objects;

public class Product {
    private String nameProduct;
    private String iDProduct;
    private double priceProduct;

    public Product() {
    }

    public Product(String nameProduct, String iDProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.iDProduct = iDProduct;
        this.priceProduct = priceProduct;
    }

    public Product(String iDProduct) {
        this.iDProduct=iDProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getiDProduct() {
        return iDProduct;
    }

    public void setiDProduct(String iDProduct) {
        this.iDProduct = iDProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", iDProduct='" + iDProduct + '\'' +
                ", priceProduct='" + priceProduct + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return iDProduct.equals(product.iDProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iDProduct);
    }
}
