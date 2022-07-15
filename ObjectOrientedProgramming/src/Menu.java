import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        menuMain();
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhap so menu can hien thi: ");
            int myNumber = input.nextInt();
            if (myNumber == 1) {
                    nhanVien();
                    System.out.print("Nhap so menu can hien thi: ");
                    int subNumber = input.nextInt();
                    if (subNumber == 0) {
                        menuMain();
                    }
            }
            if (myNumber == 2) {
                vatTu();
                System.out.print("Nhap so menu can hien thi: ");
                int subNumber = input.nextInt();
                if (subNumber == 0) {
                    menuMain();
                }
            }
            if (myNumber == 3) {
                nhanVienNghiViec();
                System.out.print("Nhap so menu can hien thi: ");
                int subNumber = input.nextInt();
                if (subNumber == 0) {
                    menuMain();
                }
            }
            if (myNumber == 0) {
                System.exit(0);
            }
        } while (true);
    }

    public static void menuMain() {
        System.out.println("################################# Menu ###############################");
        System.out.println("###       1.Danh sach nhan vien                                    ###");
        System.out.println("###       2.Danh sach vat tu                                       ###");
        System.out.println("###       3.Danh sach nhan vien nghi viec                          ###");
        System.out.println("###       0.Thoat                                                  ###");
        System.out.println("######################################################################");
    }

    public static void nhanVienNghiViec() {
        System.out.println("*********** Danh sach nha vien ***********");
        System.out.println("**   1. Nhan vien nam                   **");
        System.out.println("**   2. Nhan vien nu                    **");
        System.out.println("**   0. Quay lai Menu                   **");
        System.out.println("******************************************");
    }

    public static void vatTu() {
        System.out.println("*********** Danh sach nha vien ***********");
        System.out.println("**   1. Vat tu van phong                **");
        System.out.println("**   2. Vat tu san xuat                 **");
        System.out.println("**   0. Quay lai Menu                   **");
        System.out.println("******************************************");
    }

    public static void nhanVien() {
        System.out.println("*********** Danh sach nha vien ***********");
        System.out.println("**   1. Nhan vien nam                   **");
        System.out.println("**   2. Nhan vien nu                    **");
        System.out.println("**   0. Quay lai Menu                   **");
        System.out.println("******************************************");
    }
}
