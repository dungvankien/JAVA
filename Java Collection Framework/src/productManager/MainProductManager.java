package productManager;

import java.util.Scanner;

public class MainProductManager {
    public static void main(String[] args) {
        int numberMenu = 0;
        Scanner input = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        do {
            System.out.println("^^^^^^ Menu^^^^^^^^");
            System.out.println("1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm theo ID \n" +
                    "3. Xóa sản phẩm theo ID \n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm theo tên \n" +
                    "6. Sắp xếp sản phẩm tăng dần theo giá \n" +
                    "7. Sắp xếp sản phẩm giảm dần theo giá \n" +
                    "0. Thoát chương trình ");
            System.out.println(" Lựa chon danh sách cần thực hiện: ");
            numberMenu = input.nextInt();
            input.nextLine();
            if (numberMenu == 1) {
                System.out.println("Nhập tên sản phẩm: ");
                String nameProduct = input.nextLine();
                System.out.println("Nhập ID sản phẩm: ");
                String iDProduct = input.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                double priceProduct = input.nextDouble();
                Product product = new Product(nameProduct, iDProduct, priceProduct);
                productManager.addProduct(product);
            } else if (numberMenu == 2) {
                System.out.println("Nhập ID sản phẩm cần chỉnh: ");
                String iDProduct = input.nextLine();
                productManager.setProducts(iDProduct);
            } else if (numberMenu == 3) {
                System.out.println("Nhâp ID sản phẩm cần xóa:");
                String iDProduct = input.nextLine();
                Product product = new Product(iDProduct);
                productManager.removeProduct(product);
                System.out.println("Sản phẩm có ID: " + iDProduct + " đã xóa");
            } else if (numberMenu == 4) {
                productManager.printProduction();
            } else if (numberMenu == 5) {
                System.out.println("Nhập tên sản phẩm cần tìm:");
                String nameProduct = input.nextLine();
                productManager.findProduct(nameProduct);
            } else if (numberMenu == 6) {
                System.out.println("Sắp xêp sản phẩm tăng dần theo giá");
                productManager.sortUpProduct();
                productManager.printProduction();
            } else if (numberMenu==7) {
                System.out.println("Sắp xếp sản phẩm giảm dần theo giá");
                productManager.sortDownProduct();
                productManager.printProduction();
            }
        } while (numberMenu != 0);
    }
}
