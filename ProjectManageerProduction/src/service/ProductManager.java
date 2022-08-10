package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    Scanner input = new Scanner(System.in);
    private ArrayList<Product> products;

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void setProducts(String iDProduct) {
        for (Product product : products) {
            if (product.getiDProduct().equals(iDProduct)) {
                System.out.println("Nhập ID Cần thay đổi:");
                String iD = input.nextLine();
                product.setiDProduct(iD);
                System.out.println("Nhập têm sảm phẩm cần thay đổi:");
                String name = input.nextLine();
                product.setNameProduct(name);
                System.out.println("Nhập giá cần thay đổi:");
                double price = input.nextDouble();
                product.setPriceProduct(price);
            }
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void printProduction() {
        System.out.println(getProducts());
    }

    public void findProduct(String nameProduct) {
        for (Product product : products) {
            if (product.getNameProduct().contains(nameProduct)) {
                System.out.println(product);
            }
        }
    }

    public void sortUpProduct() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if (product1.getPriceProduct() > product2.getPriceProduct()) {
                    return 1;
                } else if (product1.getPriceProduct() < product2.getPriceProduct()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void sortDownProduct() {
        products.sort(new Comparator<Product>() {
            public int compare(Product product1, Product product2) {
                if (product1.getPriceProduct() < product2.getPriceProduct()) {
                    return 1;
                } else if (product1.getPriceProduct() > product2.getPriceProduct()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
